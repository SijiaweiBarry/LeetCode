package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/29 22:19
 */
public class T107二叉树层次遍历 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null)
            return res;
        help(root,0);
        Collections.reverse(res);
        return res;
    }
    public void help(TreeNode root,int level){
        if (root==null){
            return;
        }
        if (res.size() <= level){
            res.add(level,new ArrayList<>());
        }
        res.get(level).add(root.val);
        help(root.left,level+1);
        help(root.right,level+1);
    }

}
