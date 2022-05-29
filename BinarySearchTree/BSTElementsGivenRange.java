package BinarySearchTree;

import java.util.ArrayList;

public class BSTElementsGivenRange {
    public static void solution(Node root, int low, int high, ArrayList<Integer> list) {
        if (root == null)
            return;
        int val = root.val;

        if (val >= low)
            solution(root.left, low, high, list);
        if (val >= low && val <= high)
            list.add(val);

        if (val <= high)
            solution(root.right, low, high, list);
    }

    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        // code here.
        ArrayList<Integer> list = new ArrayList<>();
        solution(root, low, high, list);
        return list;

    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);

        System.out.println(printNearNodes(root, 10, 20));
    }
}
