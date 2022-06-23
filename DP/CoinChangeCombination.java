package DP;

public class CoinChangeCombination {
    public static int coinChangeCombination(int[] coin, int sum) {
        int n = coin.length;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = 1;
                else if (i == 0)
                    dp[i][j] = 0;
                else if (j == 0)
                    dp[i][j] = 1;
                else if (j >= coin[i - 1]) {
                    dp[i][j] = dp[i][j - coin[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return (dp[dp.length - 1][dp[0].length - 1]);

    }

    public static void main(String[] args) {
        int[] coin = { 2, 5, 4, 3 };
        int sum = 10;
        int res = coinChangeCombination(coin, sum);
        System.out.println(res);

    }
}
