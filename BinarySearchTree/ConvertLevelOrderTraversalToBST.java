package BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class ConvertLevelOrderTraversalToBST {
    public static Node constructBST(int[] arr) {
        // Write your code here
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int n = arr.length;
        Queue<Node> q = new ArrayDeque<>();

        Node root = new Node(arr[0]);
        q.add(root);
        int idx = 1;
        while (q.size() > 0 && idx < n) {

            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node temp = q.poll();
                if (idx < n) {
                    max = temp.val;
                    if (arr[idx] > min && arr[idx] < max) {
                        temp.left = new Node(arr[idx]);
                    }

                    idx = idx + 1;
                }

                if (idx < n)
                    temp.right = new Node(arr[idx]);
                idx = idx + 1;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int N = 9;
        int[] BST = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };
        Node root = constructBST(BST);
        BTSLevelOrder.levelOrder(root);
        BSTPreorder.preorder(root);
    }
}
