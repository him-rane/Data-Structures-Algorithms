package DP;

public class CatalanNumber {
    public static int catalanNumber(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += (dp[j] * dp[i - j - 1]);
            }
        }

        return (dp[n]);
    }

    public static void main(String[] args) {
        int res = catalanNumber(16);
        System.out.println(res);
    }
}
