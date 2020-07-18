package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/27 20:55
 */

/**
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 示例 1:
 *
 * 输入:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * 输出:
 *
 * 2
 * 示例 2:
 *
 * 输入:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * 输出:
 *
 * 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-univalue-path
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T687_longest_univalue_path {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
        int ans;
    public int longestUnivaluePath(TreeNode root) {
        if (root==null)return 0;
        help(root);
        return ans;
    }

    private int help(TreeNode root) {
        if (root==null){return 0;}
        int leftNum = help(root.left);
        int rightNum = help(root.right);
        int arrowLeft = 0, arrowRight = 0;
        if (root.left!=null&&root.left.val==root.val){
            arrowLeft+=leftNum+1;
        }
        if (root.right!=null&&root.right.val==root.val){
            arrowRight +=rightNum+1;
        }
        ans = Math.max(ans,arrowLeft+arrowRight);
        return Math.max(arrowLeft,arrowRight);
    }

}
