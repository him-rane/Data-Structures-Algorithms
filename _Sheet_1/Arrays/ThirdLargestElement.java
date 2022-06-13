package _Sheet_1.Arrays;

import java.util.PriorityQueue;

public class ThirdLargestElement {
    public static int thirdLargest(int a[], int n) {
        if (n < 3)
            return -1;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < 3; i++) {
            q.add(a[i]);
        }
        for (int i = 3; i < n; i++) {
            if (q.peek() < a[i]) {
                q.remove();
                q.add(a[i]);
            }
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 2, 6, 7, 9 };
        int n = a.length;
        int res = thirdLargest(a, n);
        System.out.println(res);
    }
}
