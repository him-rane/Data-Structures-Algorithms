package BinarySearchTree;

public class FindKthSmallestInBST {
    class ListNode {
        int val;
        int leftCount;
        ListNode left;
        ListNode right;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode insert(ListNode root, int x) {
        if (root == null)
            return new ListNode(x);

        if (x < root.val) {
            root.left = insert(root.left, x);
            root.leftCount++;
        }

        else if (x > root.leftCount)
            root.right = insert(root.right, x);
        return root;

    }

    public int kthSmallest(ListNode root, int k) {
        ListNode curr = root;
        while (curr != null) {
            int count = (1 + curr.leftCount);
            if (count == k)
                return curr.val;
            if (count > k) {
                curr = curr.left;
            } else {
                k = k - count;
                curr = curr.right;
            }
        }

        return -1;
    }

    ListNode root = null;

    public static void main(String[] args) {
        FindKthSmallestInBST p = new FindKthSmallestInBST();
        p.root = p.insert(p.root, 2);
        p.insert(p.root, 5);
        p.insert(p.root, 9);
        p.insert(p.root, 10);
        p.insert(p.root, 7);

        // System.out.println(p.root.leftCount);

        System.out.println(p.kthSmallest(p.root, 5));
    }
}
