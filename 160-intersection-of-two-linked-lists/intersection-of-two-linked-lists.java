/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int countA = 0;
        int countB = 0;
        while(a != null || b != null){
        if(a != null){
            countA++;
            a = a.next;
         }
        if(b != null){
            countB++;
            b = b.next;
        }
    }      
        a = headA;
        b = headB;
        if(countA>countB){
            int dif = countA - countB;
            for(int i = 0 ; i < dif ;i++)
                a= a.next;
        }
        else if(countB>countA){
            int dif = countB - countA;
            for(int i = 0 ; i < dif ;i++)
                b= b.next;
        }
        while(a != null && b != null){
            if(a == b) return a;
            a = a.next;
            b = b.next;
        }
        return null;
    }
}