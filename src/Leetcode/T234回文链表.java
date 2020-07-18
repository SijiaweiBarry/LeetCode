package Leetcode;

public class T234回文链表 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public boolean isPalindrome(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      ListNode pre = head;
      ListNode prepre = null;
      while (fast!=null && fast.next!=null){
        pre = slow;
        slow = slow.next;
        fast = fast.next.next;
        pre.next=prepre;
        prepre=pre;
      }
      if (fast!=null){
        slow = slow.next;
      }
      while (slow!=null&&pre!=null){
        if (slow.val!=pre.val){
          return false;
        }
        slow = slow.next;
        pre = pre.next;

      }
      return  true;
    }
}
