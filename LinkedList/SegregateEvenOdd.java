package LinkedList;

public class SegregateEvenOdd {
    public static void segregateEvenOdd(Node head) {
        Node low = new Node(-1);
        Node high = new Node(-1);
        low.next = head;
        high = head;

        while (high != null) {
            if (high.val % 2 == 0) {
                low = low.next;
                int temp = low.val;
                low.val = high.val;
                high.val = temp;
            }
            high = high.next;
        }
    }
}
