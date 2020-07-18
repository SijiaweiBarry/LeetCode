package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/31 10:18
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
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
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class JZ32_从上到下打印二叉树_II{
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        if (root==null)return ans;
        Deque<TreeNode>queue = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            List<Integer>temp = new ArrayList<>();
            int cnt = queue.size();
            for (int i = 0; i <cnt ; i++) {
                TreeNode cur = queue.pollFirst();
                temp.add(cur.val);
                if (cur.left!=null)queue.addLast(cur.left);
                if (cur.right!=null)queue.addLast(cur.right);
            }
            ans.add(temp);
        }
        return ans;
    }

}
