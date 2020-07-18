package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/14 23:19
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 107. 二叉树的层次遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T107_binary_tree_level_order_traversal_ii {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    List<List<Integer>>res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null)return res;
        help(root,0);
        Collections.reverse(res);
        return res;
    }

    private void help(TreeNode root, int depth) {
        if (root==null)return;
        if (res.size() == depth){
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.val);
        help(root.left,depth+1);
        help(root.right,depth+1);
    }
}
