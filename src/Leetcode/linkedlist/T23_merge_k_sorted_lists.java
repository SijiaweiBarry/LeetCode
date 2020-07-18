package Leetcode.linkedlist;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/8 18:31
 */

import java.util.Comparator;
import java.util.PriorityQueue;

/**23. 合并K个排序链表
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T23_merge_k_sorted_lists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0||lists==null) {
            return null;
        }
        PriorityQueue<ListNode>priorityQueue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i]!=null) {
                priorityQueue.add(lists[i]);
            }
        }
        ListNode temp = new ListNode(0);
        ListNode listNode = temp;
        while (!priorityQueue.isEmpty()){
            ListNode l = priorityQueue.poll();
            listNode.next = l;
            listNode = listNode.next;
            if (l.next!=null){
                priorityQueue.add(l.next);
            }
        }
        return temp.next;
    }
}
