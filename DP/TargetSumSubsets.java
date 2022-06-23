package DP;

public class TargetSumSubsets {
    public static boolean targetSumSubsets(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = false;
                else if (j == 0)
                    dp[i][j] = true;
                else if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return (dp[dp.length - 1][dp[0].length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 1, 3, 4, 5, 2, 5 };
        int sum = 17;
        boolean ans = targetSumSubsets(arr, sum);
        System.out.println(ans);
    }
}
