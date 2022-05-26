package BinaryTree;

public class IsIdentical {
    boolean isIdentical(Node root1, Node root2) {
        // Code Here
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        return root1.val == root2.val && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {

    }
}
