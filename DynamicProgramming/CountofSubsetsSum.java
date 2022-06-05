package DynamicProgramming;

public class CountofSubsetsSum {
    public static int solRec(int[] arr, int n, int sum) {
        if (sum == 0 && n == 0)
            return 1;
        if (sum == 0)
            return 1;
        if (n == 0)
            return 0;

        if (sum >= arr[n - 1]) {
            return solRec(arr, n - 1, sum - arr[n - 1]) + solRec(arr, n - 1, sum);
        }
        return solRec(arr, n - 1, sum);
    }

    public static int solTopDown(int[] arr, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (j == 0)
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
        int[] arr = { 5, 1, 2, 4, 5, 6, 3 };
        int n = arr.length;
        int sum = 10;
        System.out.println(solRec(arr, n, sum));
        System.out.println(solTopDown(arr, n, sum));
    }
}
