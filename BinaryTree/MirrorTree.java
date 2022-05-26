package BinaryTree;

public class MirrorTree {
    public static void mirror(Node node) {
        // Your code here
        if (node == null)
            return;

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);

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
        LevelOrderTraversal.levelOrderTraversal(root);
        mirror(root);
        LevelOrderTraversal.levelOrderTraversal(root);

    }
}
