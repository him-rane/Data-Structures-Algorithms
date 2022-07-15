package LoverBuberSDESheet.LinkedList;

class RemoveDuplicate {
    public static Node removeDuplicates(Node head) {
        // Your code hereNo
        Node prev = head, curr = head;
        while (curr != null) {
            if (prev.value == curr.value)
                curr = curr.next;
            else {
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        prev.next = null;

        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next = new Node(11);

        Node.printList(head);
        head = removeDuplicates(head);
        Node.printList(head);

    }

}