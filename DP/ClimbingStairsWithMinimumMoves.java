package DP;

public class ClimbingStairsWithMinimumMoves {
    public static int minimumJumps(int[] jumps, int n) {
        int[] dp = new int[n + 1];
        int len = dp.length;

        for (int i = 0; i < len; i++) {
            dp[i] = -1;
        }

        dp[len - 1] = 0;

        for (int i = len - 2; i >= 0; i--) {
            if (jumps[i] == 0)
                i--;
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= jumps[i] && i + j < len; j++) {
                if (dp[i + j] != -1)
                    min = Math.min(min, dp[i + j]);
            }
            if (min == Integer.MAX_VALUE)
                dp[i] = -1;
            else
                dp[i] = min + 1;

        }

        return dp[0];
    }

    public static void main(String[] args) {
        int[] jumps = { 3, 2, 4, 0, 20, 2, 3, 1, 2, 2 };
        int n = 10;
        int res = minimumJumps(jumps, n);
        System.out.println(res);
    }
}
