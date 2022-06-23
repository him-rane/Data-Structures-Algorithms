package DP;

public class ClimbingStairsTotalPath {
    public static int countTotalPath(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            int sum = 0;
            if (i - 1 >= 0) {
                sum += dp[i - 1];
            }
            if (i - 2 >= 0) {
                sum += dp[i - 2];
            }
            if (i - 3 >= 0) {
                sum += dp[i - 3];
            }
            dp[i] = sum;
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        int ans = countTotalPath(20);
        System.out.println(ans);
    }
}
