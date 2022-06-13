package Array;

public class KadanesAlgorithm {
    public static long maxSubarraySum(int arr[], int n) {
        long prevSum = arr[0];
        long res = arr[0];
        for (int i = 1; i < n; i++) {
            prevSum = Math.max(arr[i], prevSum + arr[i]);
            res = Math.max(res, prevSum);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4 };
        int n = arr.length;
        System.out.println(maxSubarraySum(arr, n));
    }
}
