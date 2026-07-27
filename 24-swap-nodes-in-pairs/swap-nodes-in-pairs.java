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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        int count = 1;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode odd = dummy1;
        ListNode even = dummy2;
        ListNode temp = head;
        while(temp != null){
            if(count%2 == 0){
                even.next = temp;
                even = even.next;
            }
            else{
                odd.next = temp;
                odd = odd.next;
            }
             count ++;
             temp = temp.next;
        }
        odd.next = null;
        even.next = null;
        odd = dummy1.next;
        even = dummy2.next;
        ListNode dummy3 = new ListNode(-1);
        temp = dummy3;
        while(odd != null && even != null){
            temp.next = even;
            even = even.next;
            temp = temp.next;
            temp.next = odd;
            odd = odd.next;
            temp = temp.next;
        }
        if(odd == null) temp.next = even;
        else if(even == null) temp.next = odd;
        return dummy3.next;
    }
}