package CircularLinkedList;

public class CircularLinkedList {
    class Node {
        Node next;
        int val;
    }

    Node head;
    Node tail;
    int size;

    public void add(int val) {
        Node node = new Node();
        node.val = val;
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public void display(Node head) {
        Node curr = new Node();
        if (head != null) {
            System.out.print(head.val + " ");
            curr = head.next;
        }
        while (curr != null && curr != head) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
