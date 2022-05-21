package LinkedList;

public class SegregateEvenOdd {
    public static void segregateEvenOdd(Node head) {
        Node low = new Node();
        Node high = new Node();
        low.next = head;
        high = head;

        while (high != null) {
            if (high.data % 2 == 0) {
                low = low.next;
                int temp = low.data;
                low.data = high.data;
                high.data = temp;
            }
            high = high.next;
        }
    }
}
