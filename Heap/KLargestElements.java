package Heap;

import java.util.PriorityQueue;

public class KLargestElements {
    public static void kLargestElements(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (minHeap.peek() < arr[i]) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        System.out.println(minHeap);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 19, 5, 31, 6, 13 };
        int k = 3;
        kLargestElements(arr, k);
    }
}
