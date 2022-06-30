package DP;

public class LongestBitonicSubsequence {
    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp1 = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                    max = Math.max(max, dp1[j]);
            }
            dp1[i] = 1 + max;
        }

        int[] dp2 = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int max = 0;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i])
                    max = Math.max(max, dp2[j]);
            }
            dp2[i] = 1 + max;
        }

        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, dp1[i] + dp2[i] - 1);
        }

        return (maxVal);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 2, 9, 1, 2, 3, 4 };
        int res = longestIncreasingSubsequence(arr);
        System.out.println(res);
    }
}
