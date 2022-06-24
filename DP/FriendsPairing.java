package DP;

public class FriendsPairing {
    public static int friendsPairing(int n, int[] dp) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (dp[n] != 0)
            return dp[n];
        int count = 0;
        count += friendsPairing(n - 1, dp);
        count += (friendsPairing(n - 2, dp) * (n - 1));

        return dp[n] = count;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(friendsPairing(n, dp));
    }
}
