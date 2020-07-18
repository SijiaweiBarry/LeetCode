package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 12:58
 */
public class T114二叉树展开为链表 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public void flatten(TreeNode root) {
        while(root!=null){
            if (root.left==null){
                root = root.right;
            }else {
                TreeNode pre = root.left;
                while(pre.right != null){
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}
