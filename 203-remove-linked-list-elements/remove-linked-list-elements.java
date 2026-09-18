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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode current = head;
        while(current != null){
            if(current.val != val){
                temp.next = current;
                temp = temp.next;
            }
            current = current.next;
        }
        temp.next = null;
        return dummy.next;
    }
}