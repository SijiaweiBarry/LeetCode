package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/21 20:30
 */
public class T110平衡二叉树 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean isBalanced(TreeNode root) {
        if (root==null)return true;
        int Lheight = height(root.left);
        int Rheight = height(root.right);
        return Math.abs(Lheight-Rheight)<=1&&isBalanced(root.right)&&isBalanced(root.left);
    }

    private int height(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
