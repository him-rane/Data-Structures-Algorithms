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

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        ls.add(4);
        ls.add(8);
        ls.add(90);
        ls.add(5);
        ls.add(7);
        ls.add(1);
        ls.dislplay();

        segregateEvenOdd(ls.head);
        ls.dislplay();
    }
}
