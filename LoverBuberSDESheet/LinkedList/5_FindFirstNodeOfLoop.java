package LoverBuberSDESheet.LinkedList;

class FindFirstNodeOfLoop {
    public static Node detectCycle(Node head) {
        Node node = new Node(-1);
        node.next = head;

        Node slow = node, fast = node;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast)
                break;
        }

        if (slow != fast)
            return null;

        slow = head;
        while (slow != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

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

        Node firstNode = detectCycle(head);
        System.out.println(firstNode.value);

    }
}
