package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/13 19:28
 */

import javafx.util.Pair;

import java.util.LinkedList;

/**
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T104_maximum_depth_of_binary_tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        LinkedList<Pair<TreeNode,Integer>>stack = new LinkedList<>();
        if (root==null){
            return 0;
        }
        stack.add(new Pair<>(root,1));
        while (!stack.isEmpty()){
            Pair<TreeNode,Integer>pair = stack.poll();
            int depth = pair.getValue();
            TreeNode current = pair.getKey();
            if (current!=null){
                maxDepth = Math.max(depth,maxDepth);
                stack.add(new Pair<>(current.left,depth+1));
                stack.add(new Pair<>(current.right,depth+1));
            }
        }
        return maxDepth;
    }
}
