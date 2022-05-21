package DoublyLinkedList;

public class DoublyLinkedList {
    class Node {
        Node prev;
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
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void display(Node head) {
        Node curr = new Node();
        curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void insertFirst(int val) {
        if (size == 0)
            add(val);
        else {
            Node node = new Node();
            node.val = val;
            node.next = head;
            head = node;
            size++;
        }
    }

    public void reverse() {
        Node low = head;
        Node high = tail;
        while (low != high) {
            int temp = low.val;
            low.val = high.val;
            high.val = temp;

            low = low.next;
            if (low == high)
                break;
            high = high.prev;
        }
    }

    public void deleteFirst() {
        if (size == 0)
            return;
        if (size == 1) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;

        size--;
    }

    public void deleteLast() {
        if (size == 0)
            return;
        if (size == 1) {
            head = null;
            return;
        }
        Node temp = tail.prev;
        tail.prev = null;
        temp.next = null;
        tail = temp;

    }

}
