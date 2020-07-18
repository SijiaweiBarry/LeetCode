package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/4 10:47
 */

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 * 示例 2:
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZ54_二叉搜索树的第k大节点 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    int k;
    int ans;
    public int kthLargest(TreeNode root, int k) {
        if (root==null) {
            return ans;
        }
        this.k = k;
        help(root);
        return ans;
    }

    private void help(TreeNode root) {
        if (root==null){
            return;
        }
        help(root.right);
        k--;
        if (k==0){
            ans = root.val;
            return;
        }
        help(root.left);
    }
}
