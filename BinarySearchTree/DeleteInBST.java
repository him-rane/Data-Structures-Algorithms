package BinarySearchTree;

public class DeleteInBST {
    public static Node getSuccessor(Node curr) {
        curr = curr.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }

    public static Node delNode(Node root, int x) {
        if (root == null)
            return root;
        if (root.val > x)
            root.left = delNode(root.left, x);
        else if (root.val < x)
            root.right = delNode(root.right, x);
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node succ = getSuccessor(root);
                root.val = succ.val;
                root.right = delNode(root.right, succ.val);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        root.right.right = new Node(80);
        BTSInorder.inorder(root);
        BTSLevelOrder.levelOrder(root);

        int x = 19;
        delNode(root, x);
        delNode(root, 15);

        BTSInorder.inorder(root);
        BTSLevelOrder.levelOrder(root);
    }

}
