package LoverBuberSDESheet.LinkedList;

import java.util.HashSet;

class RemoveDuplicatesInUnsortedLinkedList {
    public static Node removeDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();

        Node curr = head, prev = head;
        while (curr != null) {
            if (set.contains(curr.value)) {
                prev.next = curr.next;
            } else {
                set.add(curr.value);
                prev = curr;
            }
            curr = curr.next;
        }

        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(3);
        head.next.next = new Node(11);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next = new Node(11);
        Node.printList(head);
        Node.printList(removeDuplicates(head));
    }
}
