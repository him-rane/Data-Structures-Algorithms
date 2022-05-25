package LinkedList;

public class DeleteWithoutHeadPointer {
    void deleteNode(Node del) {
        // Your code here
        del.val = del.next.val;
        del.next = del.next.next;
    }
}
