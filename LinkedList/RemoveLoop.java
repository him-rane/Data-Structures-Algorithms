package LinkedList;

public class RemoveLoop {
    public static void removeLoop(Node head) {
        Node low = new Node(-1);
        low.next = head;

        Node high = new Node(-1);
        high.next = head;

        while (high != null && high.next != null) {
            high = high.next.next;
            low = low.next;

            if (high == low)
                break;
        }

        if (high != low)
            return;

        low = head;

        while (high.next != low) {
            low = low.next;
            high = high.next;
        }
        high.next = null;

    }
}
