package LinkedList;

public class CountNodes {
    public static int getCount(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;

    }
}
