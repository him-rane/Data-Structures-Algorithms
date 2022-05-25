package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesUnsortedList {
    public Node removeDuplicates(Node head) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = curr.next;

            } else {
                set.add(curr.val);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

}
