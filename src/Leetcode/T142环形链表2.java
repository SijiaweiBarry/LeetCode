package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/9 11:24
 */
public class T142环形链表2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head==null||head.next==null)return null;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (true){
            if (fast.next==null||fast==null){
                return null;
            }
            if (fast==slow){
                break;
            }
            fast=fast.next.next;
            slow = slow.next;
        }
        ListNode res = head;
        while (true){
            if (res==slow)return res;
            res = res.next;
            slow = slow.next;
        }
    }
}
