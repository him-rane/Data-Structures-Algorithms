package LinkedList;

public class MIddleOfLInkedList {
    public static int middleNode(Node head) {
        Node low = new Node(-1);
        low.next = head;
        Node high = new Node(-1);
        high.next = head;

        while (high != null && high.next != null) {
            low = low.next;
            high = high.next.next;
        }
        return low.val;

    }

}
