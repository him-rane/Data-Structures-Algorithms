package LinkedList;

public class FindLoopLength {
    static int countNodesinLoop(Node head) {
        Node low = new Node(-1);
        Node high = new Node(-1);
        low.next = head;
        high.next = head;

        while (high != null && high.next != null) {
            high = high.next.next;
            low = low.next;

            if (high == low)
                break;
        }

        if (high != low)
            return 0;
        int count = 0;
        do {
            high = high.next;
            count++;
        } while (high != low);

        return count;
    }
}
