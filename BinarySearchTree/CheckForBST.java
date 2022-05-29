package BinarySearchTree;

public class CheckForBST {
    public static boolean solution(Node root, int min, int max) {
        if (root == null)
            return true;

        return (min < root.val && root.val < max) && solution(root.left, min, root.val)
                && solution(root.right, root.val, max);
    }

    public static boolean isBST(Node root) {
        return solution(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(1);
        root.right.left.left = new Node(17);
        root.right.right = new Node(21);
        int x = 10;
        System.out.println(isBST(root));
    }
}
