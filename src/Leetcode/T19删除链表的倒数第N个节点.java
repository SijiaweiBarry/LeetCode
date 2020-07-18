package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/14 20:52
 */
public class T19删除链表的倒数第N个节点 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode pre = new ListNode(-1);
            pre.next = head;
            ListNode start = pre;
            ListNode end = pre;
        for (int i = 0; i <n ; i++) {
            start = start.next;
        }
        while (start.next!=null){
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
}
