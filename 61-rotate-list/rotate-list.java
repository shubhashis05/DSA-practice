/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int count = 0;
        ListNode slow = head;
        while(slow != null ){
            slow = slow.next;
            count++;
        }
        k = k % count;
        if (k == 0) return head;
        slow = head;
        ListNode fast = head;
        for(int i = 1 ; i <= k ; i++) fast = fast.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode h = slow.next;
        slow.next = null;
        fast.next = head;
        return h;
    }
}