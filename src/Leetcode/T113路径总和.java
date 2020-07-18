package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/8 21:19
 */
public class T113路径总和 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        dfs(root,sum,res,temp);
        return res;
    }

    private void dfs(TreeNode root, int sum, List<List<Integer>> res, List<Integer> temp) {
        if (root==null){
            return;
        }
        temp.add(root.val);
        if (root.left==null&&root.right==null&&sum==root.val){
            res.add(new ArrayList<>(temp));
        }
        dfs(root.left,sum-root.val,res,temp);
        dfs(root.right,sum-root.val,res,temp);
        temp.remove(temp.size()-1);
    }
}
