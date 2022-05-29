package BinarySearchTree;

public class SearchInBST {
    public static boolean searchInBST(Node root, int x) {
        if (root == null)
            return false;
        if (root.val == x)
            return true;

        return searchInBST(root.left, x) || searchInBST(root.right, x);

    }

    public static void main(String args[]) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        int x = 10;
        System.out.println(searchInBST(root, x));

    }
}
