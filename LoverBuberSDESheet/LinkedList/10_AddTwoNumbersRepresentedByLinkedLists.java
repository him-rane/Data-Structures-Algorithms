package LoverBuberSDESheet.LinkedList;

class AddTwoNumbersRepresentedByLinkedLists {
    public static Node reverse(Node head) {
        Node curr = head, prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second) {

        Node h1 = reverse(first);
        Node h2 = reverse(second);

        Node h = new Node(-1);
        Node curr = h;

        int carry = 0, val = 0;
        while (h1 != null && h2 != null) {
            int sum = h1.value + h2.value + carry;
            carry = 0;

            val = sum % 10;
            carry = sum / 10;

            Node node = new Node(val);
            curr.next = node;

            h1 = h1.next;
            h2 = h2.next;
            curr = curr.next;

        }

        while (h1 != null) {
            int sum = h1.value + carry;
            carry = 0;

            val = sum % 10;
            carry = sum / 10;

            Node node = new Node(val);
            curr.next = node;

            h1 = h1.next;
            curr = curr.next;

        }
        while (h2 != null) {
            int sum = h2.value + carry;
            carry = 0;

            val = sum % 10;
            carry = sum / 10;

            Node node = new Node(val);
            curr.next = node;

            h2 = h2.next;
            curr = curr.next;

        }

        if (carry > 0) {
            Node node = new Node(carry);
            curr.next = node;
            curr = curr.next;
        }
        return reverse(h.next);

    }

    public static void main(String[] args) {
        Node head1 = new Node(9);
        head1.next = new Node(6);
        head1.next.next = new Node(7);
        head1.next.next.next = new Node(9);

        Node head2 = new Node(9);
        head2.next = new Node(6);
        head2.next.next = new Node(7);
        head2.next.next.next = new Node(9);

        Node.printList(head1);
        Node.printList(head2);

        Node head = addTwoLists(head1, head2);

        Node.printList(head);
    }
}
