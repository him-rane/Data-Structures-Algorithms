package LoverBuberSDESheet.LinkedList;

class RemoveLoopInLinkedList {
    public static void removeLoop(Node head) {
        Node node = new Node(-1);
        node.next = head;

        Node l = node, r = node;

        while (r != null && r.next != null) {
            l = l.next;
            r = r.next.next;
            if (l == r)
                break;
        }

        if (r != l)
            return;

        l = head;
        while (r.next != l) {
            l = l.next;
            r = r.next;
        }
        r.next = null;
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

        System.out.println(DetectLoopInLinkedList.detectLoop(head));
        removeLoop(head);
        System.out.println(DetectLoopInLinkedList.detectLoop(head));

    }
}
