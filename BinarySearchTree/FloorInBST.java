package BinarySearchTree;

public class FloorInBST {
    public static int floor(Node root, int x) {
        int res = -1;
        Node curr = root;
        while (curr != null) {
            if (curr.val == x) {
                return x;
            }
            if (curr.val < x) {
                res = curr.val;
                curr = curr.right;
            } else {
                curr = curr.left;
            }

        }
        return res;

    }

    public static void main(String[] args) {
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);

        int x = 58;

        System.out.println(floor(root, x));

    }
}
