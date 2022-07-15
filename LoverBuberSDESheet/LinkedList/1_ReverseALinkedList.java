package LoverBuberSDESheet.LinkedList;

class ReverseALinkedList {
    public static Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(6);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next = new Node(5);

        Node.printList(reverseList(head));

    }
}
