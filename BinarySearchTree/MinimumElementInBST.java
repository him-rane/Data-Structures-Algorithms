package BinarySearchTree;

public class MinimumElementInBST {
    public static int minValue(Node node) {
        if (node == null)
            return -1;
        Node curr = node;
        Node prev = null;
        while (curr != null) {
            prev = curr;
            curr = curr.left;

        }
        return prev.val;

    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(1);
        root.right.left.left = new Node(17);
        root.right.right = new Node(21);

        System.out.println(minValue(root));

    }
}
