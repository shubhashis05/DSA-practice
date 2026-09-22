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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        ListNode temp = head;
        int prev = -101;
        while(temp != null){
            if(temp.val != prev){
                d.next = temp;
                d = d.next;
                prev = temp.val;
            } 
            temp = temp.next;
        }
        d.next = null;
        return dummy.next;
    }
}