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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null) return head;
        ListNode startSide = head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1 ; i < k ; i++){
            startSide = startSide.next;
            fast = fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow = slow.next;
        }
        int temp = slow.val;
        slow.val = startSide.val;
        startSide.val = temp;
        return head;
    }
}