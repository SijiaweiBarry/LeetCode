package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/8 13:18
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树，返回它的中序 遍历。
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
 * 输出: [1,3,2]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T94_binary_tree_inorder_traversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    List<Integer>ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return ans;
        }
        help(root);
        return ans;
    }

    private void help(TreeNode root) {
        if (root==null){
            return;
        }
        help(root.left);
        ans.add(root.val);
        help(root.right);
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer>ans1 = new ArrayList<>();
        if (root==null){
            return ans1;
        }
        Stack<TreeNode>stack = new Stack<>();
        TreeNode cur = root;
        while (cur!=null||!stack.isEmpty()){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            ans1.add(cur.val);
            cur = cur.right;
        }
        return ans1;
    }
}
