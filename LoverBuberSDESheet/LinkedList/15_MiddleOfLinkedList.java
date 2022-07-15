package LoverBuberSDESheet.LinkedList;

class MiddleOfLinkedList {
    public static int getMiddle(Node head) {
        // Your code here.
        Node low = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }

        return low.value;
    }

    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(3);
        head.next.next = new Node(11);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next = new Node(11);

        int res = getMiddle(head);
        System.out.println(res);

    }

}
