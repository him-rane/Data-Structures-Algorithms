package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

class ConnectListNodeAtSameLevel {
    class ListNode {
        int data;
        ListNode left;
        ListNode right;
        ListNode nextRight;

        ListNode(int data) {
            this.data = data;
            left = null;
            right = null;
            nextRight = null;
        }
    }

    public void connect(ListNode root) {
        // Your code goes here.
        if (root == null)
            return;

        Queue<ListNode> q = new ArrayDeque<>();
        q.add(root);
        ListNode prev = null;

        while (q.size() > 0) {
            int len = q.size();
            ListNode temp = q.poll();
            prev = temp;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);

            for (int i = 1; i < len; i++) {
                temp = q.poll();
                prev.nextRight = temp;
                prev = temp;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }

        }
    }
}
