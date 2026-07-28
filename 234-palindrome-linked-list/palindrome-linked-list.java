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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode t = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(t != null){
            arr.add(t.val);
            t = t.next;
        }
        int i = 0 , j = arr.size()-1;
        while(i<=j){
            if(arr.get(i) != arr.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}