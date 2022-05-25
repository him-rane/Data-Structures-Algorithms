package BinaryTree;

public class CheckForBalancedBinaryTree {
    public static int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        if (lh == -1)
            return -1;

        int rh = height(root.right);
        if (rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;
        return 1 + Math.max(lh, rh);
    }

    public static boolean isBalanced(Node root) {
        if (height(root) == -1)
            return false;
        else
            return true;
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
        System.out.println(isBalanced(root));
    }
}
