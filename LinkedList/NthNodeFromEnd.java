package LinkedList;

class Node {
    int data;
    Node next;
}

public class NthNodeFromEnd {
    public static int nthNodeFromEnd(Node head, int k) {
        if (k < 1)
            return -1;

        Node low = new Node();
        low = head;
        Node high = new Node();
        high.next = head;

        while (high != null && k > 0) {
            high = high.next;
            k--;
        }
        while (high.next != null) {
            high = high.next;
            low = low.next;
        }

        return low.data;
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(4);
        ls.add(8);
        ls.add(9);
        ls.add(5);
        ls.add(7);
        ls.add(10);
        ls.dislplay();
        System.out.println(nthNodeFromEnd(ls.head, 4));

    }
}
