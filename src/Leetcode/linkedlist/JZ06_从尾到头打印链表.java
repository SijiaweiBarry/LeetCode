package Leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/7 13:21
 */

/**剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class JZ06_从尾到头打印链表 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    List<Integer> list = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        if(head==null){return new int[0];}
        help(head);
        int []ans = new int[list.size()];
        for ( int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public void help(ListNode head){
        if(head == null){
            return;
        }
        help(head.next);
        list.add(head.val);
    }
}
