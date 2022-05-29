package BinarySearchTree;

public class CeilInBST {
    public static int ceil(Node root, int x) {
        Node curr = root;
        int res = -1;
        while (curr != null) {
            if (curr.val == x)
                return x;
            if (curr.val < x) {

                curr = curr.right;
            } else {
                res = curr.val;
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

        int x = 40;

        System.out.println(ceil(root, x));

    }

}
