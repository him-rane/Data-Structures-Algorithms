package LoverBuberSDESheet.LinkedList;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
