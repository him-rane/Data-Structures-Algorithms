package LoverBuberSDESheet.LinkedList;

class DetectLoopInLinkedList {
    public static boolean detectLoop(Node head) {
        // Add
        Node node = new Node(-1);
        node.next = head;

        Node l = node, r = node;

        while (r != null && r.next != null) {
            l = l.next;
            r = r.next.next;

            if (l == r)
                return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(6);

        // creat loop
        Node temp = head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next = temp;

        System.out.println(detectLoop(head));

    }
}
