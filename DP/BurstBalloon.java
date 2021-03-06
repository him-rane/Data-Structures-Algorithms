package DP;

public class BurstBalloon {
    public static int burstBalloon(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];

        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {

                int max = Integer.MIN_VALUE;

                for (int k = i; k <= j; k++) {
                    int left = k == i ? 0 : dp[i][k - 1];
                    int right = k == j ? 0 : dp[k + 1][j];

                    int val = (i == 0 ? 1 : arr[i - 1]) * arr[k] * (j == n - 1 ? 1 : arr[j + 1]);

                    int total = left + right + val;
                    max = Math.max(max, total);

                }
                dp[i][j] = max;

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[0][dp.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 8 };

        int res = burstBalloon(arr);
        System.out.println(res);

    }
}
