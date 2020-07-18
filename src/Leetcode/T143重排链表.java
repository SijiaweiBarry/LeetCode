package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/6 20:32
 */
public class T143重排链表 {
    public class ListNode{
        int val;
        ListNode next ;
        ListNode(int x){
            val = x;
        }
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode preList = slow;
        ListNode fast = head;
        while (fast.next.next!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode hou = slow.next;
        slow.next = null;
        ListNode pre = null;
        ListNode next = null;
        while (hou!=null){
            next = hou.next;
            hou.next = pre;
            pre = hou;
            hou = next;
        }
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        int i=0;
        while (pre!=null&&preList!=null){
            if (i%2==0){
                res.next = preList;
                res = res.next;
                preList = preList.next;
            }else {
                res.next = pre;
                res = res.next;
                pre = pre.next;
            }
            i++;
        }
        if (pre!=null){
            res.next = pre;
        }
        if (preList!=null){
            res.next = preList;
        }
        head = temp.next;
    }
}
