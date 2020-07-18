package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/19 16:37
 */
public class T230二叉搜索树中第K小的元素 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        if (kthSmallest(root.left)==k-1){
            return root.val;
        }
        return kthSmallest(root.left)<k-1?kthSmallest(root.right,k-kthSmallest(root.left)-1):kthSmallest(root.left,k);
    }
    public int kthSmallest(TreeNode root){
        if (root==null)return 0;
        return 1+kthSmallest(root.left)+kthSmallest(root.right);
    }
}
