package BinaryTree;

public class TreeFromPostorderAndInorder {
    static int postIndex = 0;

    public static Node helper(int in[], int post[], int n, int ins, int ine) {
        if (ins > ine)
            return null;
        Node root = new Node(post[n - postIndex - 1]);
        postIndex++;

        int inIndex = ins;
        for (int i = ins; i <= ine; i++) {
            if (root.val == in[i]) {
                inIndex = i;
                break;
            }
        }
        root.right = helper(in, post, n, inIndex + 1, ine);
        root.left = helper(in, post, n, ins, inIndex - 1);

        return root;
    }

    Node buildTree(int in[], int post[], int n) {
        return helper(in, post, n, 0, n - 1);
    }
}
