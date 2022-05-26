package BinaryTree;

public class MaximumPathSumFromAnyNode {
    static int p = Integer.MIN_VALUE;

    public static int findMaxSum(Node node) {
        // your code goes here
        solution(node);
        return p;

    }

    public static int solution(Node node) {
        if (node == null)
            return 0;
        int ls = solution(node.left);
        int rs = solution(node.right);
        int sum1 = Math.max((Math.max(ls, rs) + node.val), node.val);
        int sum2 = Math.max(sum1, ls + rs + node.val);
        p = Math.max(sum2, p);
        return sum1;
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
        // root.right.left.right = new Node(8);
        System.out.println(findMaxSum(root));
    }
}
