package BinaryTree;

public class LowestCommonAncestor {
    public static Node lca(Node root, int n1, int n2) {
        // Your code here
        if (root == null)
            return null;

        if (n1 == root.val || n2 == root.val)
            return root;

        Node l = lca(root.left, n1, n2);
        Node r = lca(root.right, n1, n2);

        if (l != null && r != null)
            return root;
        else if (l != null)
            return l;
        else
            return r;
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

        Node lca = lca(root, 50, 8);
        System.out.println(lca.val);
    }
}
