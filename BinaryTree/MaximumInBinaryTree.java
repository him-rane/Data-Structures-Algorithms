package BinaryTree;

public class MaximumInBinaryTree {
    public static int getMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(getMax(root.left), getMax(root.right)));
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

        System.out.println(getMax(root));

    }
}
