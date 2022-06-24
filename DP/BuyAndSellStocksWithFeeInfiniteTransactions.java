package DP;

public class BuyAndSellStocksWithFeeInfiniteTransactions {
    public static int profit(int[] arr, int fee) {
        int n = arr.length;
        int preBuy = -arr[0], preSell = 0;
        int currBuy = 0, currSell = 0;
        for (int i = 0; i < n; i++) {
            currBuy = Math.max(preBuy, preSell - arr[i]);
            currSell = Math.max(preSell, (arr[i] + currBuy - fee));

            preBuy = currBuy;
            preSell = currSell;
        }

        return (preSell);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 2, 8, 2, 4, 1, 6, 2, 7 };
        int fee = 4;
        System.out.println(profit(arr, fee));
    }
}
