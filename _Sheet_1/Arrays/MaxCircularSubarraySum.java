package _Sheet_1.Arrays;

public class MaxCircularSubarraySum {
    public static int kadane(int a[], int n) {
        int tSum = a[0];
        int maxSum = a[0];
        for (int i = 1; i < n; i++) {
            tSum = Math.max(a[i], a[i] + tSum);
            maxSum = Math.max(tSum, maxSum);
        }
        return maxSum;
    }

    static int circularSubarraySum(int a[], int n) {

        int x = kadane(a, n);
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += a[i];
        }

        for (int i = 0; i < n; i++) {
            a[i] = -a[i];
        }

        int k = kadane(a, n);
        int ress = total + k;

        if (total == -k) {
            return Math.max(total, x);
        } else {
            return Math.max(x, ress);
        }
    }
}
