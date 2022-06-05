package DynamicProgramming;

public class MinimumSubsetSumDiff {
    public static int minimumSubsetSumDiff(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                else if (j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = false;

                else if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else
                    dp[i][j] = dp[i - 1][j];
            }

        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < (dp[0].length / 2); j++) {
            if (dp[dp.length - 1][j]) {

                min = Math.min(min, sum - (2 * j));

            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 11, 5, 6 };
        System.out.println(minimumSubsetSumDiff(arr));
    }
}
