/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        HashMap<Node , Node > map = new HashMap<>(); 
        Node head2 = new Node(head.val);
        map.put(head , head2);
        Node t1 = head.next;
        Node t2 = head2;
        while(t1 != null){
            Node temp = new Node(t1.val);
            t2.next = temp;
            map.put(t1,temp);
            t1 = t1.next;
            t2 = t2.next;
        }
        t1 =head;
        t2 = head2;

        while(t1 != null){
            Node random = t1.random;
            Node temp = map.get(t1);
            temp.random = map.get(random);
            t1 = t1.next;
            t2 = t2.next;
        }
        return head2;
    }
}