package DynamicProgramming;

public class MatrixChainMultiplication {

    public static int solRec(int[] arr, int i, int j) {

        if (i >= j)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = solRec(arr, i, k) + solRec(arr, k + 1, j) + (arr[i - 1] * arr[k] * arr[j]);
            min = Math.min(temp, min);
        }
        return min;

    }

    public static int solTab(int[] arr, int i, int j, int[][] dp) {

        if (i >= j)
            return 0;
        if (dp[i][j] != 0)
            return dp[i][j];

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = solTab(arr, i, k, dp) + solTab(arr, k + 1, j, dp) + (arr[i - 1] * arr[k] * arr[j]);
            min = Math.min(temp, min);
        }
        dp[i][j] = min;
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        System.out.println("cost= " + solRec(arr, 1, arr.length - 1));

        int[][] dp = new int[n + 1][n + 1];
        System.out.println("cost= " + solTab(arr, 1, arr.length - 1, dp));

    }
}
