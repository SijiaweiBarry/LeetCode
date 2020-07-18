package Leetcode.trees;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/19 22:24
 */

/**
 * 145. 二叉树的后序遍历
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [3,2,1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T145_binary_tree_postorder_traversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer>ans = new LinkedList<>();
        LinkedList<TreeNode>stack = new LinkedList<>();
        if (root==null)return ans;
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pollLast();
            ans.addFirst(cur.val);
            if(cur.left!=null){
                stack.add(cur.left);
            }
            if(cur.right!=null){
                stack.add(cur.right);
            }
        }
        return ans;
    }
}
