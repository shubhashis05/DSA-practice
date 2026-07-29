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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        ListNode rh = reverse(a);
        a.next = head;
        head.next = null;
        return rh;
    }
    public int pairSum(ListNode head) {
        if(head.next.next == null) return head.val + head.next.val;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        fast = head;
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        while(slow != null){
           currentSum = fast.val+slow.val;
           if(max<currentSum) max = currentSum;
           fast = fast.next;
           slow = slow.next;
        }
        return max;
    }
}