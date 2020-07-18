package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/9 0:04
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**207. 课程表
 * 你这个学期必须选修 numCourse 门课程，记为 0 到 numCourse-1 。
 *
 * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们：[0,1]
 *
 * 给定课程总量以及它们的先决条件，请你判断是否可能完成所有课程的学习？
 *
 * 示例 1:
 *
 * 输入: 2, [[1,0]]
 * 输出: true
 * 解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。
 * 示例 2:
 *
 * 输入: 2, [[1,0],[0,1]]
 * 输出: false
 * 解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/course-schedule
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T207_课程表 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[]inNumber = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            inNumber[prerequisites[i][0]]++;
        }
        List<List<Integer>>list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        Queue<Integer>queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inNumber[i]==0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            Integer cur = queue.poll();
            numCourses--;
            List<Integer> temp = list.get(cur);
            for (Integer integer : temp) {
                if (--inNumber[integer]==0){
                    queue.add(integer);
                }
            }
        }
        return numCourses==0;
    }
}
