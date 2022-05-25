package LinkedList;

public class MergeTwoSortedLinkedLists {

    public static Node mergeTwoSortedList(Node h1, Node h2) {
        Node node = new Node(-1);
        Node head = node;

        Node c1 = h1;

        Node c2 = h2;

        while (c1 != null && c2 != null) {
            Node temp = new Node(-1);
            if (c1.val < c2.val) {
                temp.val = c1.val;
                c1 = c1.next;
            } else {
                temp.val = c2.val;
                c2 = c2.next;
            }
            node.next = temp;
            node = temp;
        }
        while (c1 != null) {
            Node temp = new Node(-1);
            temp.val = c1.val;
            c1 = c1.next;

            node.next = temp;
            node = temp;
        }
        while (c2 != null) {
            Node temp = new Node(-1);
            temp.val = c2.val;
            c2 = c2.next;

            node.next = temp;
            node = temp;
        }

        return head.next;
    }
}
