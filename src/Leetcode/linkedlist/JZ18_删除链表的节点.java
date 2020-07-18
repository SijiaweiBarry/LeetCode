package Leetcode.linkedlist;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/7 13:24
 */

/**剑指 Offer 18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 注意：此题对比原题有改动
 *
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 示例 2:
 *
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZ18_删除链表的节点 {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            this.val = x;
        }
    }
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){return null;}
        ListNode temp = new ListNode(-1000);
        temp.next = head;
        ListNode pre = temp;
        ListNode cur = temp.next;
        while(cur!=null){
            if(cur.val==val){
                pre.next = cur.next;
            }else{
                pre.next = cur;
                pre = pre.next;
            }
            cur = cur.next;
        }
        return temp.next;
    }
}
