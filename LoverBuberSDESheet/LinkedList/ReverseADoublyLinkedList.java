// package LoverBuberSDESheet.LinkedList;

// public class ReverseADoublyLinkedList {
// class DoublyLinkedList_Node {
// DoublyLinkedList_Node prev;
// DoublyLinkedList_Node next;
// int value;
// DoublyLinkedList_Node(int val){
// this.value=val;
// }

// }

// public static DoublyLinkedList_Node reverseDLL(DoublyLinkedList_Node head) {
// // Your code here
// DoublyLinkedList_Node curr = head, prev = null;
// while (curr != null) {
// DoublyLinkedList_Node next = curr.next;

// DoublyLinkedList_Node temp = curr.next;
// curr.next = curr.prev;
// curr.prev = temp;

// prev = curr;
// curr = next;

// }

// return prev;
// }

// public static void main(String[] args) {
// DoublyLinkedList_Node head=new DoublyLinkedList_Node(8);

// head.next=new DoublyLinkedList_Node(7);
// head.next.prev=head;

// head.next.next=new DoublyLinkedList_Node(7);
// head.next.next.prev=head.next;

// }
// }
