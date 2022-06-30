package DP;

import java.util.Arrays;

public class RussianDollEnvelopes {
    public static int russianDollEnvelopes(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (i1, i2) -> {
            return Integer.compare(i1[0], i2[0]);
        });

        int[] dp = new int[n];
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j][1] <= arr[i][1])
                    max = Math.max(max, dp[j]);
            }
            dp[i] = 1 + max;
            maxVal = Math.max(maxVal, dp[i]);
        }
        return (maxVal);
    }

    public static void main(String[] args) {
        int[][] arr = { { 3, 2, 4, 1, 4, 5, 1, 5 },
                { 7, 1, 9, 2, 0, 1, 4, 4 } };
        russianDollEnvelopes(arr);
    }
}
