package BinarySearchTree;

import BinaryTree.LevelOrderTraversal;

public class InsertInBST {
    public static Node insert(Node root, int x) {
        if (root.val == x)
            return root;
        if (root.val > x) {
            if (root.left == null) {
                Node node = new Node(x);
                root.left = node;
            }
            insert(root.left, x);
        } else {
            if (root.right == null) {
                Node node = new Node(x);
                root.right = node;
            }
            insert(root.right, x);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        BTSInorder.inorder(root);
        BTSLevelOrder.levelOrder(root);

        int x = 19;
        insert(root, x);
        insert(root, 23);

        BTSInorder.inorder(root);
        BTSLevelOrder.levelOrder(root);
    }
}
