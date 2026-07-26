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
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        int count = 0 ;
        while(slow != null){
            slow = slow.next;
            count++;
        }
        k  = k % count;
        if(k == 0 ) return head;
        slow = head;
        ListNode fast = head;
        for(int i = 0 ; i < k ; i++){
            fast = fast.next;
        }
        while(fast.next != null ){
            fast= fast.next;
            slow = slow.next;
        }
        ListNode h = slow.next;
        fast.next = head;
        slow.next= null;
        return  h;
    }
}