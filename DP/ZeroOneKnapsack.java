package DP;

public class ZeroOneKnapsack {
    public static int zeroOneKnapsack(int[] val, int[] wt, int cap) {
        int n = val.length;
        int dp[][] = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= wt[i - 1])
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return (dp[dp.length - 1][dp[0].length - 1]);
    }

    public static void main(String[] args) {
        int[] wt = { 2, 3, 4, 5 };
        int[] val = { 1, 2, 3, 4 };
        int cap = 5;
        System.out.println(zeroOneKnapsack(val, wt, cap));
    }
}
