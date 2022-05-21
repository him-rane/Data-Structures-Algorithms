package LinkedList;

class Node {
    int data;
    Node next, random;

    Node(int x) {
        data = x;
        next = random = null;
    }
}

public class LinkedListInsertion {
    Node insertAtBeginning(Node head, int x) {
        // code here
        Node node = new Node(x);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        return head;

    }

    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node node = new Node(x);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr != null && curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        return head;
    }
}
