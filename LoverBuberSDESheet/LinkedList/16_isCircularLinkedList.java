package LoverBuberSDESheet.LinkedList;

class isCircularLinkedList {
    public static boolean isCircular(Node head) {
        // Your code here

        Node curr = head;
        while (curr != null) {

            curr = curr.next;
            if (curr == head)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(3);
        head.next.next = new Node(11);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next = head;

        boolean res = isCircular(head);
        System.out.println(res);
    }
}
