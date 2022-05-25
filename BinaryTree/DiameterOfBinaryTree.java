package BinaryTree;

public class DiameterOfBinaryTree {
    static int diameter = 0;

    public static int diameterOfBinaryTree(Node root) {
        if (root == null)
            return 0;
        int lh = diameterOfBinaryTree(root.left);
        int rh = diameterOfBinaryTree(root.right);

        diameter = Math.max(lh + rh + 1, diameter);
        return 1 + Math.max(lh, rh);

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
        diameter = 0;
        diameterOfBinaryTree(root);
        System.out.println(diameter);

    }

}
