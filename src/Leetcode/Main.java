package Leetcode;


import java.util.*;
public class Main {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        int j = 0;
        while (l1!=null||l2!=null){
            int l1temp = l1==null?0:l1.val;
            int l2temp = l2==null?0:l2.val;
            temp.next = new ListNode((l1temp+l2temp)%10+j);
            j = (l1temp+l2temp)/10;
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        if (j==1)temp.next = new ListNode(1);
        return res.next;
    }

    public static void main(String[] args) {

    }
}
