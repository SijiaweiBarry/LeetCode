package Leetcode.linkedlist;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/7 9:13
 */

/**
 * 203. 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class T203_remove_linked_list_elements {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) {
            return null;
        }
        ListNode temp = new ListNode(-1000);
        temp.next = head;
        ListNode pre = temp;
        ListNode cur = temp.next;
        while (cur!=null){
            if (cur.val==val){
                pre.next = cur.next;
            }else {
                pre.next = cur;
                pre = pre.next;
            }
            cur = cur.next;
        }
        return temp.next;
    }
}
