package BinarySearchTree;

import java.util.Map;
import java.util.TreeMap;

public class VerticalSumInBinaryTree {
    public static void sol(Node root, int k, TreeMap<Integer, Integer> map) {

        if (root == null)
            return;
        sol(root.left, k - 1, map);

        if (map.containsKey(k))
            map.put(k, map.get(k) + root.val);
        else
            map.put(k, root.val);

        sol(root.right, k + 1, map);
    }

    public static void verticalSum(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int k = 0;
        sol(root, k, map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.print(entry.getValue() + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(1);
        root.right.left.left = new Node(17);
        root.right.right = new Node(21);

        verticalSum(root);

    }

}
