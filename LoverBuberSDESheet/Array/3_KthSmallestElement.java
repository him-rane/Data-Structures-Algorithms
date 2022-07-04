package LoverBuberSDESheet.Array;

import java.util.Collections;
import java.util.PriorityQueue;

class KthSmallestElement {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (q.peek() > arr[i]) {
                q.remove();
                q.add(arr[i]);
            }
        }

        return q.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 56, 23, 12, 43, 12 };
        int k = 3;
        kthSmallest(arr, k);
    }
}
