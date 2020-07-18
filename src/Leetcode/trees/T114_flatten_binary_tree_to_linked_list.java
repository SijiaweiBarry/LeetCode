package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/19 10:16
 */
public class T114_flatten_binary_tree_to_linked_list {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    private TreeNode pre = null;
    public void flatten(TreeNode root) {
        if (root==null)return;
        flatten(root.right);
        flatten(root.left);
        root.left=null;
        root.right = pre;
        pre = root;
    }
}
