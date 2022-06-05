package DynamicProgramming;

public class UnboundedKnapsack {
    public static int solRec(int[] val, int[] wt, int n, int w) {
        if (n == 0 || w == 0)
            return 0;

        if (w >= wt[n - 1]) {
            return Math.max(val[n - 1] + solRec(val, wt, n, w - wt[n - 1]), solRec(val, wt, n - 1, w));
        }

        return solRec(val, wt, n - 1, w);
    }

    public static int solTopDown(int[] val, int[] wt, int n, int w) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;

                else if (j >= wt[i - 1]) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        int W = 8;
        int val[] = { 10, 40, 50, 70 };
        int wt[] = { 1, 3, 4, 5 };
        int n = val.length;
        System.out.println(solRec(val, wt, n, W));
        System.out.println(solTopDown(val, wt, n, W));
    }
}
