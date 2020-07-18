package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 14:47
 */
public class T105从前序与中序遍历序列构造二叉树 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder==null||preorder.length==0||inorder==null||inorder.length==0||preorder.length!=inorder.length){
            return null;
        }
        return help(0,preorder.length-1,preorder,0,inorder.length-1,inorder);
    }
    public TreeNode help(int pre_start,int pre_end,int[]pre,int in_start,int in_end,int[]in){
        if (pre_start>pre_end||in_start>in_end){
            return null;
        }
        TreeNode root = new TreeNode(pre[pre_start]);
        int index = 0;
        while (in[in_start+index] != pre[pre_start]){
            index++;
        }
        root.left = help(pre_start+1,pre_start+index,pre,in_start,in_start+index-1,in);
        root.right = help(pre_start+index+1,pre_end,pre,in_start+index+1,in_end,in);
        return root;
    }
}
