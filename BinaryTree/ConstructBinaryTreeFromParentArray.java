package BinaryTree;

import java.util.HashMap;

public class ConstructBinaryTreeFromParentArray {
    public static Node createTree(int parent[], int N) {
        // Your code here
        HashMap<Integer, Node> map = new HashMap<>();
        Node root = null;
        for (int i = 0; i < N; i++) {
            Node node = new Node(i);
            map.put(i, node);
        }
        for (int i = 0; i < N; i++) {
            if (parent[i] == -1) {
                root = map.get(i);
            } else {
                if (map.get(parent[i]).left == null) {
                    map.get(parent[i]).left = map.get(i);
                } else
                    map.get(parent[i]).right = map.get(i);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[] parent = { -1, 0, 0, 1, 1, 3, 5 };
        int N = parent.length;
        Node root = createTree(parent, N);

        LevelOrderTraversal.levelOrderTraversal(root);
    }
}
