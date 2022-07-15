package LoverBuberSDESheet.LinkedList;

class MergeSortForLinkedList {
    public static Node getMid(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node sortedList = new Node(-1);
        Node node = sortedList;

        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                node.next = head1;
                head1 = head1.next;
            } else {
                node.next = head2;
                head2 = head2.next;
            }
            node = node.next;
        }

        while (head1 != null) {
            node.next = head1;
            node = node.next;
            head1 = head1.next;
        }
        while (head2 != null) {
            node.next = head2;
            node = node.next;
            head2 = head2.next;
        }

        return sortedList.next;

    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;
        Node mid = getMid(head);

        Node head1 = head;
        Node head2 = mid.next;
        mid.next = null;

        Node newHead1 = mergeSort(head1);
        Node newHead2 = mergeSort(head2);

        Node sortedList = merge(newHead1, newHead2);

        return sortedList;

    }

    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(3);
        head.next.next = new Node(15);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(12);
        head.next.next.next.next.next.next.next = new Node(16);

        Node.printList(head);
        Node.printList(mergeSort(head));
        // mergeSort(head);

    }
}
