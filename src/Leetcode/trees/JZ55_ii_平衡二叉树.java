package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/4 10:55
 */
/**
    剑指 Offer 55 - II. 平衡二叉树
 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。

 示例 1:

 给定二叉树 [3,9,20,null,null,15,7]

 3
 / \
 9  20
 /  \
 15   7
 返回 true 。

 示例 2:

 给定二叉树 [1,2,2,3,3,null,null,4,4]

   1
  / \
 2   2
 / \
3  3
 / \
4   4
 返回 false 。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZ55_ii_平衡二叉树 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }

    private int recur(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = recur(root.left);
        if (left==-1){
            return -1;
        }
        int right = recur(root.right);
        if (right==-1){
            return -1;
        }

        return Math.abs(left-right)>=2?-1:Math.max(left,right)+1;
    }
}
