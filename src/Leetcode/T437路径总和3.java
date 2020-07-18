package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/27 19:30
 */
public class T437路径总和3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int pathSum(TreeNode root, int sum) {
        if (root==null){
            return 0;
        }
        return help(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }
    public int help(TreeNode root,int sum){
        if (root==null){
            return 0;
        }
        sum = sum - root.val;
        return (sum==0?1:0) + help(root.left,sum) + help(root.right,sum);
    }
}

