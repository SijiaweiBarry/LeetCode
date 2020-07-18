package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/27 20:43
 */
public class T94二叉树的中序遍历 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        help(list,root);
        return list;
    }
    public void help(List<Integer> list,TreeNode root){
        if (root != null){
            if (root.left != null){
                help(list,root.left);
            }
            list.add(root.val);
            if (root.right != null){
                help(list,root.right);
            }
        }
    }

}
