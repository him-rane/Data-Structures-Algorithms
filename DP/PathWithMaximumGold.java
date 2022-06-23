package DP;

public class PathWithMaximumGold {
    public static int maxGold(int[][] gold) {
        int n = gold.length;
        int m = gold[0].length;

        int[][] dp = new int[n][m];
        for (int j = m - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {

                if (j == m - 1)
                    dp[i][j] = gold[i][j];
                else if (i == 0)
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                else if (i == n - 1)
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                else
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1], (Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1])));
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] gold = { { 1, 2, 3 }, { 4, 3, 2 }, { 5, 2, 4 } };
        int res = maxGold(gold);
        System.out.println(res);
    }
}
