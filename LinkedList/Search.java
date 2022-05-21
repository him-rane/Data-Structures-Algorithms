package LinkedList;

public class Search {
    public static boolean search(Node head, int k) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == k)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(4);
        ls.add(8);
        ls.add(9);
        ls.add(5);
        ls.add(7);
        ls.add(10);
        System.out.println(search(ls.head, 90));

    }
}
