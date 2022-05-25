package LinkedList;

public class ReverseInGroups {
    public static Node reverseInGroup(Node head, int k) {
        Node current = head;
        Node prevFirst = null;
        boolean isFirst = true;
        while (current != null) {
            int temp = 0;
            Node prev = null;
            Node first = current;
            while (current != null && temp < k) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                temp++;
            }
            if (isFirst) {
                head = prev;
                isFirst = false;
            } else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }

}
