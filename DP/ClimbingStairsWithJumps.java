package DP;

public class ClimbingStairsWithJumps {
    public static int climbingStairsTotalPath(int n, int[] jumps) {
        int[] dp = new int[n + 1];
        dp[dp.length - 1] = 1;
        for (int i = dp.length - 2; i >= 0; i--) {
            for (int j = 0; j <= jumps[i] && i + j < n + 1; j++) {
                dp[i] += dp[i + j];
            }
        }

        for (int val : dp) {
            System.out.print(val + " ");
        }

        return dp[0];
    }

    public static void main(String[] args) {
        int[] jumps = { 5, 5, 2, 4, 1, 5, 9, 8, 6, 3, 8, 9, 1 };
        int n = 13;
        int res = climbingStairsTotalPath(n, jumps);
        System.out.println(res);
    }
}
