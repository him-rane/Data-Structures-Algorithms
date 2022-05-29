package BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BTSLevelOrder {
    public static void levelOrder(Node root) {
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
}
