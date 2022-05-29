package BinarySearchTree;

import java.util.HashSet;

public class PairSumWithGivenBST {
    public static boolean solution(Node root, int sum, HashSet<Integer> set) {
        if (root == null)
            return false;

        if (solution(root.left, sum, set))
            return true;

        if (set.contains(sum - root.val))
            return true;
        else
            set.add(root.val);

        return solution(root.right, sum, set);

    }

    public static boolean pairSum(Node root, int sum) {
        HashSet<Integer> set = new HashSet<>();

        return solution(root, sum, set);
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(1);
        root.right.left.left = new Node(17);
        root.right.right = new Node(21);
        int sum = 26;
        System.out.println(pairSum(root, sum));
    }
}
