package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/31 16:26
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**剑指 Offer 32 - III. 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 *  
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZ32_III_从上到下打印二叉树_III {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        if (root==null) {
            return ans;
        }
        Deque<TreeNode>queue = new ArrayDeque<>();
        queue.addLast(root);
        int flag = 0;
        while (!queue.isEmpty()){
            int cnt = queue.size();
            List<Integer>temp  = new ArrayList<>();
            for (int i = 0; i <cnt ; i++) {
                TreeNode cur = queue.pollFirst();
                if (flag%2==0){temp.add(cur.val);}else {temp.add(0,cur.val);}
                if (cur.left!=null){
                    queue.addLast(cur.left);
                }
                if (cur.right!=null){
                    queue.addLast(cur.right);
                }
            }
            flag++;
            ans.add(temp);
        }
        return ans;
    }
}
