package LinkedList;

public class isIdentical {
    public boolean isIdentical(Node head1, Node head2) {
        // write your code here
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != null && curr2 != null) {
            if (curr1.val != curr2.val)
                return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        if (curr1 != null || curr2 != null)
            return false;

        return true;

    }
}
