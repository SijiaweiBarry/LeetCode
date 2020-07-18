package Leetcode.linkedlist;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/6 16:35
 */

/**82. 删除排序链表中的重复元素 II
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 *
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class T82_remove_duplicates_from_sorted_list_ii {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){return null;}
        ListNode temp = new ListNode(-1000);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp.next;
        while (fast!=null){
          while (fast.next!=null&&fast.val == fast.next.val){
              fast = fast.next;
          }
          if (slow.next==fast){
            slow = slow.next;
          }else {
            slow.next = fast.next;
          }
          fast = fast.next;
        }
        return temp.next;
    }
}
