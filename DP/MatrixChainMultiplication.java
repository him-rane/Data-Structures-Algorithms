package DP;

public class MatrixChainMultiplication {
    public static int matrixChainMultiplication(int[] arr, int n) {
        int[][] dp = new int[n - 1][n - 1];

        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {
                if (g == 0) {
                    dp[i][j] = 0;
                } else if (g == 1) {
                    dp[i][j] = arr[i] * arr[j] * arr[j + 1];
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        int val = dp[i][k] + dp[k + 1][j] + (arr[i] * arr[k + 1] * arr[j + 1]);
                        min = Math.min(min, val);
                    }
                    dp[i][j] = min;
                }
            }

        }

        return dp[0][dp.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        int res = matrixChainMultiplication(arr, n);
        System.out.println(res);
    }
}
