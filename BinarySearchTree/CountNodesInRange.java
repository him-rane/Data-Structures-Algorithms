package BinarySearchTree;

public class CountNodesInRange {
    public static int getCount(Node root, int low, int high) {
        if (root == null)
            return 0;

        if (root.val >= low && root.val <= high)
            return 1 + getCount(root.left, low, high) + getCount(root.right, low, high);
        if (root.val < low)
            return getCount(root.right, low, high);
        else
            return getCount(root.left, low, high);

    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);

        System.out.println(getCount(root, 10, 20));
    }
}
