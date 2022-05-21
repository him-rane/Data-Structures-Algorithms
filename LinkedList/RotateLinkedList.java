package LinkedList;

public class RotateLinkedList {
    public Node rotate(Node head, int k) {
        // add code here
        Node pivot = new Node(-1);
        pivot.next = head;

        while (pivot != null && k > 0) {
            pivot = pivot.next;
            k--;
        }

        Node curr = pivot;
        while (curr != null && curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;

        head = pivot.next;
        pivot.next = null;

        return head;
    }
}
