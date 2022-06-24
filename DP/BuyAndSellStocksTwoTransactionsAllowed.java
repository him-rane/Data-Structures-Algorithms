package DP;

public class BuyAndSellStocksTwoTransactionsAllowed {
    public static int profit(int[] arr) {
        int n = arr.length;
        int[] dp1 = new int[n];
        dp1[0] = 0;
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            dp1[i] = Math.max(dp1[i - 1], arr[i] - min);
        }

        int[] dp2 = new int[n];
        dp2[n - 1] = 0;
        int max = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            dp2[i] = Math.max(dp2[i + 1], max - arr[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp1[i] + dp2[i]);

        }

        return (res);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 5, 2, 8, 2, 1, 8 };
        int res = profit(arr);
        System.out.println(res);
    }
}
