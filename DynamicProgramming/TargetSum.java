package DynamicProgramming;

public class TargetSum {
    public static int targetSum(int[] arr, int n, int sum) {
        int arrSum = 0;
        for (int i : arr) {
            arrSum += i;
        }
        sum = (arrSum - sum) / 2;
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = 1;
                else if (j == 0)
                    dp[i][j] = 1;
                else if (i == 0)
                    dp[i][j] = 0;

                else if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3 };
        int n = arr.length;
        int sum = 1;
        System.out.println(targetSum(arr, n, sum));
    }
}
