package BinarySearchTree;

import java.util.ArrayList;

public class FindCommonNodesInTwoBSTs {
    public static void inorder(Node root, int idx, ArrayList<Integer> in, ArrayList<Integer> ans) {
        if (root == null)
            return;
        inorder(root.left, idx, in, ans);
        if (root.val == in.get(idx)) {
            ans.add(root.val);
            idx++;
            inorder(root.right, idx, in, ans);
        } else if (root.val < in.get(idx)) {
            inorder(root.right, idx, in, ans);
        } else {
            idx++;
        }

    }

    public static void inorder(Node root, ArrayList<Integer> in) {
        if (root == null)
            return;
        inorder(root.left, in);
        in.add(root.val);
        inorder(root.right, in);
    }

    public static ArrayList<Integer> findCommon(Node root1, Node root2) {
        // code here
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root1, in);
        inorder(root2, 0, in, ans);
        return ans;

    }
}
