package LinkedList;

public class MergeTwoSortedLinkedLists {
    public static Node mergeTwoSortedList(Node h1, Node h2) {
        Node node = new Node();
        Node head = node;

        Node c1 = h1;

        Node c2 = h2;

        while (c1 != null && c2 != null) {
            Node temp = new Node();
            if (c1.data < c2.data) {
                temp.data = c1.data;
                c1 = c1.next;
            } else {
                temp.data = c2.data;
                c2 = c2.next;
            }
            node.next = temp;
            node = temp;
        }
        while (c1 != null) {
            Node temp = new Node();
            temp.data = c1.data;
            c1 = c1.next;

            node.next = temp;
            node = temp;
        }
        while (c2 != null) {
            Node temp = new Node();
            temp.data = c2.data;
            c2 = c2.next;

            node.next = temp;
            node = temp;
        }

        return head.next;
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(6);
        ls.add(9);
        ls.add(15);
        ls.add(16);
        ls.dislplay();

        LinkedList rs = new LinkedList();
        rs.add(0);
        rs.add(4);
        rs.add(8);
        rs.dislplay();

        rs.dislplay(mergeTwoSortedList(ls.head, rs.head));

    }
}
