package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/31 16:51
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**剑指 Offer 34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 *
 *  
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZ34_二叉树中和为某一值的路径 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null||sum==0) {
            return ans;
        }
        List<Integer>path = new ArrayList<>();
        help(path,root,sum);
        return ans;
    }

    private void help(List<Integer> path, TreeNode root, int sum) {
        if (root==null){
            return;
        }
        if (sum==0&&root.left==null&&root.right==null){
            ans.add(new ArrayList<>(path));
        }
        path.add(root.val);
        help(path,root.left,sum-root.val);
        help(path,root.right,sum-root.val);
        path.remove(path.size()-1);
    }

//    LinkedList<List<Integer>> res = new LinkedList<>();
//    LinkedList<Integer> path = new LinkedList<>();
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        recur(root, sum);
//        return res;
//    }
//    void recur(TreeNode root, int tar) {
//        if(root == null) return;
//        path.add(root.val);
//        tar -= root.val;
//        if(tar == 0 && root.left == null && root.right == null)
//            res.add(new LinkedList(path));
//        recur(root.left, tar);
//        recur(root.right, tar);
//        path.removeLast();
//    }


}
