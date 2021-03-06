package LinkedList;

public class DetectLoop {

    public static boolean detectLoop(Node head) {
        Node low = new Node(-1);
        low.next = head;

        Node high = new Node(-1);
        high.next = head;

        while (high != null && high.next != null) {
            low = low.next;
            high = high.next.next;
            if (high == low)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
