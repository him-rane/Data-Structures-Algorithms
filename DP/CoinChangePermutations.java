package DP;

public class CoinChangePermutations {
    public static int coinChangePermutations(int[] coins, int sum) {
        int n = coins.length;
        int[] dp = new int[sum + 1];
        int len = dp.length;
        dp[0] = 1;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < n; j++) {
                if (i - coins[j] >= 0)
                    dp[i] += dp[i - coins[j]];
            }
        }

        return (dp[len - 1]);
    }

    public static void main(String[] args) {
        int[] coins = { 3, 4, 5, 6, 8 };
        int sum = 50;
        int res = coinChangePermutations(coins, sum);
        System.out.println(res);
    }
}
