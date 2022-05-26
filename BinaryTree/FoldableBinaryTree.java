package BinaryTree;

public class FoldableBinaryTree {
    public static boolean compare(Node node1, Node node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null || node2 == null)
            return false;

        return compare(node1.left, node2.right) && compare(node1.right, node2.left);

    }

    public static boolean isFoldable(Node node) {
        // your code
        if (node == null)
            return true;
        if (node.left == null && node.right == null)
            return true;

        if (node.left == null || node.right == null)
            return false;

        return compare(node.left, node.right);
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
        // root.right.left.right = new Node(8);
        System.out.println(isFoldable(root));
    }
}
