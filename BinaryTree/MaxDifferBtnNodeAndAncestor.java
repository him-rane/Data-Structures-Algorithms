package BinaryTree;

public class MaxDifferBtnNodeAndAncestor {
    static int p = Integer.MIN_VALUE;

    public static int maxDiff(Node root) {
        // your code here
        solution(root);
        return p;
    }

    public static int solution(Node node) {
        if (node == null)
            return Integer.MAX_VALUE;
        if (node.left == null && node.right == null)
            return node.val;

        int ls = solution(node.left);
        int rs = solution(node.right);

        int min = Math.min(ls, rs);
        p = Math.max(p, node.val - min);
        return Math.min(min, node.val);

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
        System.out.println(solution(root));
    }
}
