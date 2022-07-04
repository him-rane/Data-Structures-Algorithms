package LoverBuberSDESheet.Array;

class KadanesAlgorithm {
    public static long maxSubarraySum(int arr[], int n) {
        int maxSum = arr[0];
        int tempSum = arr[0];
        for (int i = 1; i < n; i++) {
            tempSum = Math.max(tempSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, -1, -3, 2, -8, 4 };
        int n = arr.length;
        long res = maxSubarraySum(arr, n);
        System.out.println(res);

    }
}
