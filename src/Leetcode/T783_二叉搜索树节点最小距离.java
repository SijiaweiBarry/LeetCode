package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/9/17 15:55
 *
 * 给定一个二叉搜索树的根节点 root，返回树中任意两节点的差的最小值。
 *
 * 示例：
 *
 * 输入: root = [4,2,6,1,3,null,null]
 * 输出: 1
 * 解释:
 * 注意，root是树节点对象(TreeNode object)，而不是数组。
 *
 * 给定的树 [4,2,6,1,3,null,null] 可表示为下图:
 *
 *           4
 *         /   \
 *       2      6
 *      / \
 *     1   3
 *
 * 最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T783_二叉搜索树节点最小距离 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    int ans = Integer.MAX_VALUE;
    TreeNode pre;
    public int minDiffInBST(TreeNode root) {
        if (root==null){
            return 0;
        }
        pre = null;
        help(root);
        return ans;
    }

    private void help(TreeNode root) {
        if (root==null){
            return;
        }
        help(root.left);
        if (pre!=null){
            ans = Math.min(ans,root.val-pre.val);
        }
        pre = root;
        help(root.right);

    }
}
