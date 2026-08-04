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
    public void reverseList(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        ListNode n;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        if(left == right) return head;
        ListNode temp = head;
        ListNode a= null;
        ListNode b= null;
        ListNode c= null;
        ListNode d= null;
        int count = 1;
        while(temp != null){
            if(count == left-1) a = temp;
            if(count == left) b = temp;
            if(count == right) c = temp;
            if(count == right+1) d = temp; 
            temp = temp.next;
            count++;
        }
        if(a != null)a.next = null;
        if(c != null)c.next = null;
        reverseList(b);
        if(a != null)a.next = c;
        b.next = d;
        if(a == null) return  c;
        return head;
    }
}