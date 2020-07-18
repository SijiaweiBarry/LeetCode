package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/1 17:06
 */
public class T92反转链表2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    ListNode h = null;
  public ListNode reverseN(ListNode head,int n){
      if (n==1){
          h = head.next;
          return head;
        }
      ListNode last = reverseN(head.next,n-1);
      head.next.next = head;
      head.next = h;
      return last;
  }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m==1){
            return reverseN(head,n);
        }
        head.next = reverseBetween(head.next,m-1,n-1);
        return head;
    }
}
