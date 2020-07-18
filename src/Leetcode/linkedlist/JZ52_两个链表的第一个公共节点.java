package Leetcode.linkedlist;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/7 14:49
 */

/**剑指 Offer 52. 两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZ52_两个链表的第一个公共节点 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode Ahead = headA;
        ListNode Bhead = headB;
        while (headA!=headB) {
            headA = headA == null ? Bhead : headA.next;
            headB = headB == null ? Ahead : headB.next;
        }
        return headA;
    }
}
