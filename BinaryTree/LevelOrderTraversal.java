package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrderTraversal(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node temp = q.poll();
                System.out.print(temp.val + " ");

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            System.out.println();
        }
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

        levelOrderTraversal(root);

    }
}
