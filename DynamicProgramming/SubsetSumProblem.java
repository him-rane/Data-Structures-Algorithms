package DynamicProgramming;

public class SubsetSumProblem {
    public static boolean solTopDown(int[] arr, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                else if (j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = false;

                if (j > arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else
                    dp[i][j] = dp[i - 1][j];
            }

        }

        return dp[dp.length - 1][dp[0].length];

    }

    public static boolean solRec(int[] arr, int n, int sum) {
        if (sum == 0 && n == 0)
            return true;
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
        if (sum >= arr[n - 1])
            return solRec(arr, n - 1, sum - arr[n - 1]) || solRec(arr, n - 1, sum);
        else
            return solRec(arr, n - 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = { 70, 10, 50, 60, 30, 20, 90 };
        int n = arr.length;
        int sum = 30;

        System.out.println(solRec(arr, n, sum));
    }
}
