package LoverBuberSDESheet.LinkedList;

class IntersectionPointInYShappedLinkedLists {
    int intersectPoint(Node head1, Node head2) {
        // code here
        Node curr1 = head1;
        Node curr2 = head2;

        while (curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;

            if (curr1 == curr2)
                return curr1.value;

            if (curr1 == null) {
                curr1 = head2;
            }

            if (curr2 == null) {
                curr2 = head1;
            }

        }

        return -1;
    }

}
