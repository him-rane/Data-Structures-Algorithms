package DoublyLinkedList;

public class test {
    public static void main(String[] args) {
        DoublyLinkedList ls = new DoublyLinkedList();
        ls.add(8);
        ls.add(4);
        ls.add(6);
        ls.add(8);
        ls.add(9);
        ls.add(2);
        ls.add(1);

        ls.deleteFirst();
        ls.deleteLast();

        ls.display(ls.head);
        ls.reverse();
        ls.display(ls.head);
    }
}
