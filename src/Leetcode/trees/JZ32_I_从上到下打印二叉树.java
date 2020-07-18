package Leetcode.trees;

/**
 * @Author SijiaweiBarry
 * @create 2020/7/31 10:39
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 *
 *
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回：
 *
 * [3,9,20,15,7]
 *
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 */
public class JZ32_I_从上到下打印二叉树 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int[] levelOrder(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        Deque<TreeNode> l = new ArrayDeque<>();
        if (root==null)return new int[0];
        l.addLast(root);
        while (!l.isEmpty()){
            int cnt = l.size();
            for (int i = 0; i <cnt ; i++) {
                TreeNode cur = l.pollFirst();
                list.add(cur.val);
                if (cur.left!=null)l.addLast(cur.left);
                if (cur.right!=null)l.addLast(cur.right);
            }
        }
        int[]ans = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
