package LinkedList;

public class AddTwoNumbers {
    public static Node reverse(Node node) {
        Node prev = null;
        while (node != null) {
            Node temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }

    static Node addTwoLists(Node first, Node second) {
        first = reverse(first);
        second = reverse(second);

        Node sumList = new Node(-1);
        Node curr = sumList;

        int carry = 0;
        while (first != null && second != null) {
            int sum = first.data + second.data + carry;
            carry = 0;
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            }
            curr.next = new Node(sum);
            curr = curr.next;
            first = first.next;
            second = second.next;
        }
        while (first != null) {
            int sum = first.data + carry;
            carry = 0;
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            }
            curr.next = new Node(sum);
            curr = curr.next;
            first = first.next;
        }
        while (second != null) {
            int sum = second.data + carry;
            carry = 0;
            if (sum > 9) {
                sum = sum - 10;
                carry = 1;
            }
            curr.next = new Node(sum);
            curr = curr.next;
            second = second.next;
        }
        if (carry == 1) {
            curr.next = new Node(carry);
            curr = curr.next;
        }
        return reverse(sumList.next);
    }
}
