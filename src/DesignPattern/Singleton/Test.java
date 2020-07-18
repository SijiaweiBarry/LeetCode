package DesignPattern.Singleton;


import java.util.Scanner;
import java.util.Stack;

/**
 * @Author SijiaweiBarry
 * @create 2020/3/17 11:11
 */
public class Test {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public static ListNode Sum(ListNode L1,ListNode L2) {
        if (L1==null)return L2;
        if (L2==null)return L1;
        int i = 0 ;
        ListNode res = new ListNode(0);
        ListNode head = res;
        while (L1!=null||L2!=null){
            int l1 = L1==null?0:L1.val;
            int l2 = L2==null?0:L2.val;
            int temp = l1+l2;
            res.next = new ListNode(temp%10+i);
            res = res.next;
            if (temp/10!=0){
                i=1;
            }else {
                i=0;
            }
            if (L1!=null)L1 = L1.next;
            if (L2!=null)L2 = L2.next;
        }
        if (i==1){
            res.next = new ListNode(1);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(7);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(9);
        ListNode f = new ListNode(2);
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;
        ListNode test = Sum(a,d);
        while (test!=null){
            System.out.print(test.val+" ");
            test = test.next;
        }
    }
}
