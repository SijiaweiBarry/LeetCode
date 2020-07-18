package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/10 13:28
 */

import java.util.LinkedList;

/**
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回滑动窗口中的最大值。
 * 进阶：
 *
 * 你能在线性时间复杂度内解决此题吗？
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sliding-window-maximum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T239_滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer>linkedList = new LinkedList<>();
        int[]result = new int[nums.length-k+1];
        for (int i = 0; i < nums.length; i++) {
            while (!linkedList.isEmpty()&&nums[i]>linkedList.peekLast()){
                linkedList.pollLast();
            }
            linkedList.addLast(i);
            if (i-k>=linkedList.peekFirst()){
                linkedList.pollFirst();
            }
            if (i>=k-1){
                result[i-k+1] = linkedList.peekFirst();
            }
        }
        return result;
    }
}
