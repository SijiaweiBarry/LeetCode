package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/30 13:00
 */
public class T24两两交换链表中的节点 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode L1 = head.next;
        head.next = swapPairs(L1.next);
        L1.next = head;
        return L1;
    }
}
