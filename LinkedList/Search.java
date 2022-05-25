package LinkedList;

public class Search {
    public static boolean search(Node head, int k) {
        Node curr = head;
        while (curr != null) {
            if (curr.val == k)
                return true;
            curr = curr.next;
        }
        return false;
    }

}
