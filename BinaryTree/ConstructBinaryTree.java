package BinaryTree;

public class ConstructBinaryTree {
    static int preIndex = 0;

    public static Node cTree(int in[], int pre[], int is, int ie) {
        if (is > ie)
            return null;
        Node root = new Node(pre[preIndex++]);

        int inIndex = is;
        for (int i = is; i <= ie; i++) {
            if (in[i] == root.val) {
                inIndex = i;
                break;
            }
        }
        root.left = cTree(in, pre, is, inIndex - 1);
        root.right = cTree(in, pre, inIndex + 1, ie);
        return root;
    }

    public static void main(String[] args) {
        int[] in = { 40, 20, 60, 50, 70, 10, 80, 100, 30 };
        int[] pre = { 10, 20, 44, 50, 60, 70, 30, 80, 100 };
        int n = pre.length;

        LevelOrderTraversal.levelOrderTraversal(cTree(in, pre, 0, n - 1));
    }
}
