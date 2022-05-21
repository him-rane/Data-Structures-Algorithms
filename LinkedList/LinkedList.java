package LinkedList;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        node.next = null;
        size++;
    }

    public void dislplay() {
        Node curr = new Node();
        curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void dislplay(Node head) {
        Node curr = new Node();
        curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void deleteFirst() {
        if (size == 0)
            return;
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (size == 0)
            return;
        else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node curr = head;
            while (curr.next != null) {
                if (curr.next == tail) {
                    curr.next = null;
                    tail = curr;
                    size--;
                    break;
                }
                curr = curr.next;
            }
        }
    }

    public void insertAt(int k, int data) {
        if (size < k) {
            System.out.println("Invalid Input");
            return;
        }
        if (size == 0 || k == 0) {
            insertFirst(data);
            return;
        }
        ;
        Node curr = new Node();
        curr.next = head;
        while (k > 0 && curr != null) {
            curr = curr.next;
            k--;
        }
        Node node = new Node();
        node.data = data;
        node.next = curr.next;

        curr.next = node;
        size++;
    }

}
