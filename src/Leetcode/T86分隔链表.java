package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/30 12:57
 */
public class T86分隔链表 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode partition(ListNode head, int x) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode more = new ListNode(-1);
        ListNode moreHead = more;
        ListNode less = new ListNode(-1);
        ListNode lessHead = less;
        while(head!=null){
            if (head.val>=x){
                more.next = head;
                more = more.next;
            }else {
                less.next = head;
                less = less.next;
            }
            head = head.next;
        }
        more.next = null;
        less.next = moreHead.next;
        return lessHead.next;
    }
}
