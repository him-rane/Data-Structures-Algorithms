package BinarySearchTree;

public class BSTPreorder {
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);

            preorder(root.right);
        }
    }
}
