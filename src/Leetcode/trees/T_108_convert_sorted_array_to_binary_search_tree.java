package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/8 14:04
 */
public class T_108_convert_sorted_array_to_binary_search_tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(0,nums.length-1,nums);
    }

    private TreeNode dfs(int left, int right, int[] nums) {
        if (left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(left,mid-1,nums);
        root.right = dfs(mid+1,right,nums);
        return root;
    }
}
