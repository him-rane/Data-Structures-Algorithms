package DP;

public class BuyAndSellStocksInfiniteTransactionsAllowed {
    public static int profit(int[] arr) {
        int n = arr.length;
        int profite = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                profite += (arr[i] - arr[i - 1]);
            }
        }

        return (profite);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 1, 8, 2 };
        System.out.println(profit(arr));
    }
}
