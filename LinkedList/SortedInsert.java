package LinkedList;

public class SortedInsert {

    public static void sortedInsert(Node head, int k) {

        Node curr = new Node(-1);
        curr = head.next;
        while (curr != null && curr.next != null && curr.next.val < k) {
            curr = curr.next;
        }
        Node node = new Node(-1);
        node.val = k;

        node.next = curr.next;
        curr.next = node;
    }

}
