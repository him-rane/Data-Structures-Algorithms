package LinkedList;

public class NthNodeFromEnd {
    public static int nthNodeFromEnd(Node head, int k) {
        if (k < 1)
            return -1;

        Node low = new Node(-1);
        low = head;
        Node high = new Node(-1);
        high.next = head;

        while (high != null && k > 0) {
            high = high.next;
            k--;
        }
        while (high.next != null) {
            high = high.next;
            low = low.next;
        }

        return low.val;
    }

}
