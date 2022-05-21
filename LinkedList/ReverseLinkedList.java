package LinkedList;

public class ReverseLinkedList {
    public static Node reverse(Node head) {
        Node curr = new Node();
        curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        ls.add(4);
        ls.add(8);
        ls.add(9);
        ls.add(5);
        ls.add(7);
        ls.add(10);
        ls.dislplay();

        ls.dislplay(reverse(ls.head));

    }
}
