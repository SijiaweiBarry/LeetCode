package Leetcode;

import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/10/1 10:00
 */
public class T83_删除排序链表中重复元素 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        ListNode newHead = new ListNode(-1000);
        newHead.next = head;
        ListNode temp = head;
        while (temp!=null){
            if (temp.val==head.val){
                temp = temp.next;
            }else {
                head.next = temp;
                head = head.next;
                temp = temp.next;
            }

        }
        head.next=null;
        return newHead.next;
    }
}
