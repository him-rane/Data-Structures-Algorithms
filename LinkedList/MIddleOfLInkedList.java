package LinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

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
        System.out.println(middleNode(ls.head));
    }
}
