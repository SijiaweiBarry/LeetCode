package DesignPattern.Singleton;
public class Test1{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
//    public static ListNode reverseN (ListNode head,int n){
//
//    }

    public static void main(String[] args) {
        ListNode a = new ListNode(7);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(6);
        a.next = b;
        b.next = c;
       // ListNode test = reverseN(a);
//        while (test!=null){
//            System.out.print(test.val+" ");
//            test = test.next;
//        }
    }
}