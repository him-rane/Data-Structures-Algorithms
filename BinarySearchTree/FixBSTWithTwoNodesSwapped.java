package BinarySearchTree;

public class FixBSTWithTwoNodesSwapped {
    static Node first, second;

    public static void solution(Node root, int min, int max) {
        if (root == null)
            return;
        if (root.val < min || root.val > max) {
            if (first == null)
                first = root;
            else
                second = root;
        }
        solution(root.left, min, root.val);
        solution(root.right, root.val, max);

    }

    public static Node swapped(Node root) {

        solution(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(first.val + " " + second.val);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(2);

        System.out.println(CheckForBST.isBST(root));
        swapped(root);
        System.out.println(CheckForBST.isBST(root));

    }
}
