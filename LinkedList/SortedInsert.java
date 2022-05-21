package LinkedList;

public class SortedInsert {
    public static void sortedInsert(Node head, int k) {
        Node curr = new Node();
        curr = head.next;
        while (curr != null && curr.next != null && curr.next.data < k) {
            curr = curr.next;
        }
        Node node = new Node();
        node.data = k;

        node.next = curr.next;
        curr.next = node;
    }

}
