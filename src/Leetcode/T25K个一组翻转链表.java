package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/3 12:03
 */
public class T25K个一组翻转链表 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a,b;
        a=head;
        b=head;
        for (int i = 0; i <k ; i++) {
            if (b==null) return head;
            b = b.next;
        }
        ListNode newHead = reverse(a,b);
        a.next = reverseKGroup(b,k);
        return newHead;
    }
    public ListNode reverse(ListNode a,ListNode b){
        ListNode cur = a;
        ListNode pre = null;
        ListNode nex = null;
        while (cur!=b){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}
