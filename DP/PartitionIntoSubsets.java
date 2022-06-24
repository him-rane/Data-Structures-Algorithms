package DP;

public class PartitionIntoSubsets {
    public static long partitionKSubset(int n, int k, long[][] dp) {
        if (k == n)
            return 1;
        if (k == 0)
            return 0;
        if (n == 0)
            return 0;
        long count = 0;
        if (dp[n][k] != 0)
            return dp[n][k];
        count += (partitionKSubset(n - 1, k, dp) * k);
        count += (partitionKSubset(n - 1, k - 1, dp));

        return dp[n][k] = count;

    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        long[][] dp = new long[n + 1][k + 1];
        System.out.println(partitionKSubset(n, k, dp));
    }
}
