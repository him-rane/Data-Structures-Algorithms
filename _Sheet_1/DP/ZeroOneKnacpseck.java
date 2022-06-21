package _Sheet_1.DP;

public class ZeroOneKnacpseck {

    static int knapSack(int W, int wt[], int val[], int n) {
        // your code here
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= wt[i - 1]) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }
}
