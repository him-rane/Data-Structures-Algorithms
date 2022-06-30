package DP;

public class MinSquares {
    public static int minSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - (j * j)]);
            }
            dp[i] = min + 1;
        }

        return (dp[dp.length - 1]);
    }

    public static void main(String[] args) {
        int n = 45;
        int res = minSquares(n);
        System.out.println(res);
    }
}
