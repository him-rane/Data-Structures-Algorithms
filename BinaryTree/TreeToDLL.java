package BinaryTree;

public class TreeToDLL {
    static Node prev = null;

    public static Node treeToDLL(Node root) {
        if (root == null)
            return root;
        Node head = treeToDLL(root.left);

        if (prev == null)
            head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        treeToDLL(root.right);
        return head;
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(13);
        root.right.right = new Node(15);

        root.left.right.left = new Node(17);
        root.right.left.right = new Node(8);
        Node head = treeToDLL(root);

        while (head != null) {
            System.out.println(head.val);
            head = head.right;
        }
    }
}
