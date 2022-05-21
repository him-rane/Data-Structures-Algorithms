package LinkedList;

class Node {
    int data;
    Node next, random;

    Node(int x) {
        data = x;
        next = random = null;
    }
}

public class PalindromeLinkedList {
    public static Node reverse(Node node) {
        Node prev = null;
        while (node != null) {
            Node temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }

    boolean isPalindrome(Node head) {
        // Your code here
        Node dummy = new Node(-1);
        dummy = head.next;

        Node low = head;
        Node high = dummy;

        while (high != null && high.next != null) {
            low = low.next;
            high = high.next.next;
        }
        low.next = reverse(low.next);
        high = low.next;
        low = head;

        while (high != null) {
            if (high.data != low.data)
                return false;
            high = high.next;
            low = low.next;
        }
        return true;

    }
}
