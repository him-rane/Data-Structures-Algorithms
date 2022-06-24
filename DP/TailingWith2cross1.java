package DP;

public class TailingWith2cross1 {
    public static int sol(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[][] dp = new int[2][n];

        dp[0][0] = 1;
        dp[1][0] = 0;

        dp[0][1] = 1;
        dp[1][1] = 1;

        for (int j = 2; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + dp[1][j - 1];
            dp[1][j] = dp[0][j - 2] + dp[1][j - 2];
        }

        return dp[0][n - 1] + dp[1][n - 1];

    }

    public static void main(String[] args) {

    }
}
