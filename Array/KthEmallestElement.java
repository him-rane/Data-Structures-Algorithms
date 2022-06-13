package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthEmallestElement {
    public static int kthSmallest(int[] arr, int k) {

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
        int[] arr = { 1, 5, 3, 2, 7, 9 };
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}
