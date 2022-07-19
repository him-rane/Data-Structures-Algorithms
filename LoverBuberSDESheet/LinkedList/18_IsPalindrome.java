package LoverBuberSDESheet.LinkedList;

class IsPalindrome {
    public static Node reverse(Node head) {
        Node curr = head, prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        // Your code here
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node head1 = head;
        Node head2 = reverse(slow.next);

        while (head2 != null) {
            if (head1.value != head2.value)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;

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

        boolean res = isPalindrome(head);
        System.out.println(res);
    }
}
