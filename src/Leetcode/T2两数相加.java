package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/1/31 22:15
 */
public class T2两数相加 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        if (l1==null)return l2;
        if (l2==null)return l1;
        int b=0;
        while (l1!=null&&l2!=null){
            b = 0;
            int temp = l1.val + l2.val;
            if (temp >=10){
                temp -=10;
                b = 1;
            }
            res.next = new ListNode(temp + b);
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null){
            while (l1 != null){
                int temp = l1.val + b;
                if (temp==10){
                    temp=0;
                    b=1;
                }
                res.next = new ListNode(temp + b);
                l1 = l1.next;
            }
        }
        if (l2 != null){
            while (l2 != null){
                int temp = l2.val + b;
                if (temp==10){
                    temp=0;
                    b=1;
                }
                res.next = new ListNode(temp + b);
                l2 = l2.next;
            }
        }
        if (b==1){
            res.next = new ListNode(1);
        }
        return res.next;
    }
}
