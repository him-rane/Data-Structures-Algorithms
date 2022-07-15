package LoverBuberSDESheet.LinkedList;

class ReverseLinkedListInGroups {
    public static Node reverse(Node node, int k) {
        // Your code here
        Node curr = node, prevFirst = null;
        boolean isFirst = true;

        while (curr != null) {
            int count = 0;
            Node prev = null, first = curr;
            while (curr != null && count < k) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            if (isFirst) {
                node = prev;
                isFirst = false;
            } else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }

        return node;
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

        Node.printList(reverse(head, 3));

    }
}
