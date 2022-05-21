package CircularLinkedList;

public class test {
    public static void main(String[] args) {
        CircularLinkedList ls = new CircularLinkedList();
        ls.add(5);
        ls.add(3);
        ls.add(7);
        ls.add(4);
        ls.add(6);
        ls.display(ls.head);
    }

}
