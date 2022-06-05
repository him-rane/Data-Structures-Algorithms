package DynamicProgramming;

public class ZeroOneKnapsack {

    public static int solTopDown(int[] wt, int[] val, int w, int n) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];

    }

    public static int solTab(int[] wt, int[] val, int w, int n, int[][] dp) {

        if (n == 0 || w == 0)
            return 0;
        if (dp[n][w] != 0)
            return dp[n][w];

        if (wt[n - 1] <= w)
            return dp[n][w] = Math.max(val[n - 1] + solTab(wt, val, w - wt[n - 1], n - 1, dp),
                    solTab(wt, val, w, n - 1, dp));

        return dp[n][w] = solTab(wt, val, w, n - 1, dp);

    }

    public static int solRec(int[] wt, int[] val, int w, int n) {

        if (n == 0 || w == 0)
            return 0;

        if (wt[n - 1] <= w) {
            return Math.max(val[n - 1] + solRec(wt, val, w - wt[n - 1], n - 1), solRec(wt, val, w, n - 1));
        }
        return solRec(wt, val, w, n - 1);
    }

    public static void main(String[] args) {
        int val[] = { 95, 60, 85, 70, 100, 120, 90, 45, 23, 12, 34, 97, 92 };
        int wt[] = { 10, 23, 29, 15, 20, 30, 25, 56, 23, 11, 15, 16, 34 };
        int w = 200;
        int n = wt.length;

        int ans = solRec(wt, val, w, n);
        System.out.println(ans);

        int[][] dp = new int[n + 1][w + 1];
        ans = solTab(wt, val, w, n, dp);
        System.out.println(ans);

        ans = solTopDown(wt, val, w, n);
        System.out.println(ans);

    }
}
