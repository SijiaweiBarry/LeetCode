package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/8 14:14
 */
public class T226_invert_binary_tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right= invertTree(temp);
        return root;
    }
}
