package Leetcode.linkedlist;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/6 23:31
 */

/**109. 有序链表转换二叉搜索树
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 *
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T109_convert_sorted_list_to_binary_search_tree {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode sortedListToBST(ListNode head) {
        if (head ==null){return null;}
        if (head.next==null){return new TreeNode(head.val);}
        return help(head,null);

    }

    private TreeNode help(ListNode left, ListNode right) {
        if (left==right){
            return null;
        }
        ListNode slow = left;
        ListNode fast = left;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode mid = new TreeNode(slow.val);
        mid.left = help(left,slow);
        mid.right = help(slow.next,right);
        return mid;
    }
}
