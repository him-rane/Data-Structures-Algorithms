package Heap;

import java.util.PriorityQueue;

public class SortKElm {
    private static void sortK(int[] arr, int n, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k + 1; i++) {
            pq.add(arr[i]);
        }

        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.peek();
            pq.poll();
            pq.add(arr[i]);
        }

        while (pq.isEmpty() == false) {
            arr[index++] = pq.poll();
        }

    }
}
