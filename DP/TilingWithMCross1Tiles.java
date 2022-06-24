package DP;

public class TilingWithMCross1Tiles {
    public static int sol(int n, int m) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[][] dp = new int[m][n + 1];

        dp[0][0] = 1;
        dp[1][0] = 0;

        dp[0][1] = 1;
        dp[1][1] = 0;

        for (int j = 1; j < n + 1; j++) {
            dp[0][j] = dp[0][j - 1] + dp[1][j - 1];

            if (j - m >= 0)
                dp[1][j] = dp[0][j - m] + dp[1][j - m];

        }

        return dp[0][n] + dp[1][n];

    }

    public static void main(String[] args) {
        int n = 39;
        int m = 16;
        int res = sol(n, m);
        System.out.println(res);
    }
}
