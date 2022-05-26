package BinaryTree;

public class VerticalWidth {
    static int rightLevel = 0;
    static int leftLevel = 0;

    public static void helper(Node root, int level) {
        if (root == null)
            return;

        rightLevel = Math.max(rightLevel, level);
        leftLevel = Math.min(leftLevel, level);

        helper(root.left, level - 1);
        helper(root.right, level + 1);
    }

    public static int verticalWidth(Node root) {
        // code here.
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        rightLevel = 0;
        leftLevel = 0;

        helper(root, 0);
        return rightLevel - leftLevel + 1;
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
        System.out.println(verticalWidth(root));
    }
}
