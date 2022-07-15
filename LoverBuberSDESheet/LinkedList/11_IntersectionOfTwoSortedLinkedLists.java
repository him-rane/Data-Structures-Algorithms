package LoverBuberSDESheet.LinkedList;

class IntersectionOfTwoSortedLinkedLists {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node head = new Node(-1);
        Node curr = head;
        while (head1 != null && head2 != null) {
            int val1 = head1.value, val2 = head2.value;

            if (val1 == val2) {
                Node node = new Node(val1);
                curr.next = node;
                curr = curr.next;
                head1 = head1.next;
                head2 = head2.next;

            } else if (val1 < val2) {
                head1 = head1.next;
            } else
                head2 = head2.next;

        }

        return head.next;

    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(1);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(2);

        Node head2 = new Node(1);
        head2.next = new Node(1);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(3);

        Node.printList(head1);
        Node.printList(head2);

        Node head = findIntersection(head1, head2);

        Node.printList(head);
    }
}
