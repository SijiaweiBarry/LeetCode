package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/27 19:46
 */
public class T543二叉树的直径 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }
        res = 1;
        depth(root);
        return res - 1;
    }
    public int depth(TreeNode root){
        if (root==null){
            return 0;
        }
        int L = depth(root.left);
        int R = depth(root.right);
        res = Math.max(res , L + R + 1);
        return Math.max(L,R)+1;
    }
}
