package LinkedList;

public class RemoveDuplicates {
    public static void removeDuplicates(Node head) {
        Node prev = head;
        Node curr = head;
        while (curr != null) {
            if (curr.data == prev.data) {
                curr = curr.next;
            } else {
                prev.next = curr;
                prev = curr;
            }
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        ls.add(4);
        ls.add(4);
        ls.add(5);
        ls.add(5);
        ls.add(5);
        ls.add(10);
        ls.add(11);

        removeDuplicates(ls.head);
        ls.dislplay();

    }
}
