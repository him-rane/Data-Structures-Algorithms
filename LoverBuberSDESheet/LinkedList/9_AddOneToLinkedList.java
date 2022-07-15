package LoverBuberSDESheet.LinkedList;

class AddOneToLinkedList {
    public static Node reverce(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static Node addOne(Node head) {
        // code here.
        Node tHead = reverce(head);
        Node curr = tHead;

        int sum = curr.value + 1;
        curr.value = sum % 10;
        int carry = sum / 10;
        curr = curr.next;

        while (carry > 0 && curr != null) {
            int val = curr.value + carry;
            carry = 0;
            sum = val % 10;
            carry = val / 10;

            curr.value = sum;
            curr = curr.next;
        }
        if (carry > 0) {

            Node h = new Node(1);
            h.next = tHead;
            return h;
        }

        return reverce(tHead);
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next = new Node(9);
        Node.printList(head);
        Node.printList(addOne(head));
    }
}
