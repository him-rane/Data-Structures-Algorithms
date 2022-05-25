package LinkedList;

public class RemoveDuplicates {
    public static void removeDuplicates(Node head) {
        Node prev = head;
        Node curr = head;
        while (curr != null) {
            if (curr.val == prev.val) {
                curr = curr.next;
            } else {
                prev.next = curr;
                prev = curr;
            }
        }
        prev.next = null;
    }

}
