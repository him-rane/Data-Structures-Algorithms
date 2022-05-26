package BinaryTree;

public class CheckIfSubtree {
    public static boolean compare(Node node1, Node node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null || node2 == null)
            return false;

        return node1.val == node2.val && compare(node1.left, node2.left) && compare(node1.right, node2.right);

    }

    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if (T == null && S == null)
            return true;
        if (T == null || S == null)
            return false;

        boolean flag = false;
        if (T.val == S.val) {
            flag = compare(T, S);
        }
        return flag || isSubtree(T.left, S) || isSubtree(T.right, S);

    }
}
