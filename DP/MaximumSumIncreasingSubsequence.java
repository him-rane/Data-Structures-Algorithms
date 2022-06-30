package DP;

public class MaximumSumIncreasingSubsequence {
    public static int maximumSumIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            int maxLeft = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[i])
                    maxLeft = Math.max(dp[j], maxLeft);
            }
            dp[i] = maxLeft + arr[i];
            maxVal = Math.max(maxVal, dp[i]);
        }

        return (maxVal);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 7, 2, 3, 4, 5, 6, 1, 1 };
        int res = maximumSumIncreasingSubsequence(arr);
        System.out.println(res);
    }
}
