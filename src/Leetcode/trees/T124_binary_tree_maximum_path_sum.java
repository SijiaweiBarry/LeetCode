package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/27 21:49
 */
public class T124_binary_tree_maximum_path_sum {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        help(root);
        return ans;
    }

    private int help(TreeNode root) {
        if (root==null)return 0;
        int leftLength = help(root.left);
        int rightLength = help(root.right);
        ans = Math.max(ans,leftLength+rightLength+root.val);
        return Math.max(0,Math.max(leftLength,rightLength)+root.val);
    }
}
