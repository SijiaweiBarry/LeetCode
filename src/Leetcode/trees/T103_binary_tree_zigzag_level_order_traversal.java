package Leetcode.trees;

import java.util.*;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/30 16:49
 */

/**103. 二叉树的锯齿形层次遍历
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层次遍历如下：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T103_binary_tree_zigzag_level_order_traversal {
    class TreeNode{
        int val;
        TreeNode left ;
        TreeNode right ;
        public TreeNode(int x){
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        if (root==null)return ans;
        Queue<TreeNode>queue = new ArrayDeque<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()){
            List<Integer>temp = new LinkedList<>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode cur = queue.poll();
                if (depth%2==0){
                    temp.add(cur.val);
                }else {
                    temp.add(0,cur.val);
                };
                if (cur.left!=null){queue.add(cur.left);}
                if (cur.right!=null){queue.add(cur.right);}
            }
            ans.add(temp);
            depth++;
        }
        return ans;
    }
}
