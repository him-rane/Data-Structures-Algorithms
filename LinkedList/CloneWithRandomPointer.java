package LinkedList;

class Node {
    int data;
    Node next, random;

    Node(int x) {
        data = x;
        next = random = null;
    }
}

public class CloneWithRandomPointer {

    public static void print(Node start) {
        Node ptr = start;
        while (ptr != null) {
            System.out.println("Data = " + ptr.data + ", Random  = " + ptr.random.data);
            ptr = ptr.next;
        }
    }

    public static Node clone(Node head) {
        Node next, temp;
        for (Node curr = head; curr != null;) {
            next = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = next;
            curr = next;
        }
        for (Node curr = head; curr != null; curr = curr.next.next) {
            curr.next.random = (curr.random != null) ? (curr.random.next) : null;
        }

        Node original = head, copy = head.next;

        temp = copy;

        while (original != null && copy != null) {
            original.next = original.next != null ? original.next.next : original.next;

            copy.next = copy.next != null ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }

        return temp;
    }
}
