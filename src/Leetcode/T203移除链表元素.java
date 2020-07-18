package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/6 22:08
 */
public class T203移除链表元素 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode removeElements(ListNode head,int val){
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode l = res;
        ListNode temp = new ListNode(0);
        while (res!=null&&res.next!=null){
            if (res.next.val==val){
                temp = res.next;
                while (temp.val==val){
                    temp=temp.next;
                }
            }
            res.next = temp;
            res= res.next;
        }

        return l.next;
    }
}
