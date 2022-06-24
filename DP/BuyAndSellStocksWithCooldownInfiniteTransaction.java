package DP;

public class BuyAndSellStocksWithCooldownInfiniteTransaction {
    public static int profit(int[] arr) {
        int n = arr.length;
        int preBuy = -arr[0], preSell = 0, preCool = 0;
        int currBuy = 0, currSell = 0, currCool = 0;
        for (int i = 1; i < n; i++) {
            currBuy = Math.max(preBuy, preCool - arr[i]);
            currSell = Math.max(preSell, preBuy + arr[i]);
            currCool = Math.max(preCool, preSell);
            preBuy = currBuy;
            preSell = currSell;
            preCool = currCool;
        }

        return (preSell);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 6, 2, 8, 3, 6, 3 };
        System.out.println(profit(arr));
    }
}
