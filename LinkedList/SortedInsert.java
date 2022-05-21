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

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);
        ls.add(60);

        ls.dislplay();
        sortedInsert(ls.head, 29);
        ls.dislplay();

    }
}
