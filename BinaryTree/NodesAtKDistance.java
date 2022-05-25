package BinaryTree;

public class NodesAtKDistance {
    public static void printAtKDistance(Node root, int k) {
        if (root == null)
            return;
        if (k == 0) {
            System.out.println(root.val);
        }

        printAtKDistance(root.left, k - 1);
        printAtKDistance(root.right, k - 1);
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

        printAtKDistance(root, 2);

    }
}
