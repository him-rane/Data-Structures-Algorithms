package DP;

import java.util.Arrays;

public class MaximumNonoverlappingBridges {
    public static int maximumNonoverlappingBridges(int[][] bridg) {
        int n = bridg.length;
        Arrays.sort(bridg, (i1, i2) -> {
            if (i1[0] == i2[0])
                return Integer.compare(i1[1], i2[1]);
            else
                return Integer.compare(i1[0], i2[0]);

        });

        int[] dp = new int[n];
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (bridg[j][1] <= bridg[i][1])
                    max = Math.max(max, dp[j]);
            }
            dp[i] = 1 + max;
            maxVal = Math.max(maxVal, dp[i]);
        }
        return (maxVal);
    }

    public static void main(String[] args) {
        int[][] bridg = { { 3, 2, 4, 1, 4, 5, 1, 5 },
                { 7, 1, 9, 2, 0, 1, 4, 4 } };
        maximumNonoverlappingBridges(bridg);
    }
}
