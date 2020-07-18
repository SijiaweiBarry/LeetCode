package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/8 21:54
 */
public class T102二叉树的层序遍历 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)return res;
        helper(root,0);
        return res;
    }

    private void helper(TreeNode root, int i) {
        if (res.size()==i){
            res.add(new ArrayList<>());
        }
        res.get(i).add(root.val);
        if (root.left!=null){
            helper(root.left,i+1);
        }
        if (root.right!=null){
            helper(root.right,i+1);
        }
    }
}
