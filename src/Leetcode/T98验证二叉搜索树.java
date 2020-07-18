package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/5 9:58
 */

public class T98验证二叉搜索树 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    Long pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        if (!isValidBST(root.left)){
            return false;
        }
        if (pre!=null&&pre>=root.val){
            return false;
        }
        pre = (long)root.val;
        return isValidBST(root.right);
    }
}
