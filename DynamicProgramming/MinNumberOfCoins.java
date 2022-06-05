package DynamicProgramming;

public class MinNumberOfCoins {
    public static int minNumberOfCoinsDP(int[] coins, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0)
                    dp[i][j] = Integer.MAX_VALUE - 1;
                else if (j == 0)
                    dp[i][j] = 0;

                else if (j >= coins[i - 1])
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];

    }

    public static int minNumberOfCoins(int[] coins, int n, int sum) {
        if (n == 0)
            return Integer.MAX_VALUE - 1;
        if (sum == 0)
            return 0;

        if (sum >= coins[n - 1])
            return Math.min(1 + minNumberOfCoins(coins, n, sum - coins[n - 1]), minNumberOfCoins(coins, n - 1, sum));
        else
            return minNumberOfCoins(coins, n - 1, sum);

    }

    public static void main(String[] args) {
        int[] coin = { 3, 7, 5 };
        int sum = 4;
        int n = coin.length;
        System.out.println(minNumberOfCoinsDP(coin, n, sum));
    }
}
