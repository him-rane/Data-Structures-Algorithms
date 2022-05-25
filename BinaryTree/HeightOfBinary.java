package BinaryTree;

public class HeightOfBinary {
    public static int heightOfBinary(Node root) {

        if (root == null)
            return 0;

        return 1 + Math.max(heightOfBinary(root.left), heightOfBinary(root.right));
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println(heightOfBinary(root));
    }
}
