package DP;

public class BuyAndSellStocksOneTransaction {
    public static int profit(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            min = Math.min(arr[i], min);
            maxProfit = Math.max(maxProfit, arr[i] - min);
        }

        return (maxProfit);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 1, 8, 2 };
        System.out.println(profit(arr));
    }
}
