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
    public ListNode oddEvenList(ListNode head) {
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
        odd.next = dummy2.next;
        even.next = null;
        return dummy1.next;
     }
}