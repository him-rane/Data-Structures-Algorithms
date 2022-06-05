package DynamicProgramming;

public class RodCuttingProblem {
    public static int rodCutting(int[] val, int[] wt, int n, int w) {
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
        int[] val = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int[] length = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int w = 8;
        int n = val.length;
        System.out.println(rodCutting(val, length, n, w));
    }
}
