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

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        ls.add(9);
        ls.add(10);
        ls.add(11);
        ls.add(12);
        ls.dislplay();
        ls.dislplay(reverseInGroup(ls.head, 3));
    }
}
