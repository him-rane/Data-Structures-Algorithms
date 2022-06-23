package _Sheet_1.DP;

public class MaximizeTheCutSegments {
    public int maximizeCuts(int n, int x, int y, int z) {
        // Your code here
        int[] dp = new int[n + 1];
        boolean flag = false;
        for (int i = 1; i < n + 1; i++) {
            int max = 0;
            if (i - x >= 0) {
                if (dp[i - x] != 0 || (dp[i - x] == 0 && i - x == 0)) {
                    max = Math.max(max, dp[i - x]);
                    flag = true;
                }
            }
            if (i - y >= 0) {
                if (dp[i - y] != 0 || (dp[i - y] == 0 && i - y == 0)) {
                    max = Math.max(max, dp[i - y]);
                    flag = true;
                }
            }
            if (i - z >= 0) {
                if (dp[i - z] != 0 || (dp[i - z] == 0 && i - z == 0)) {
                    max = Math.max(max, dp[i - z]);
                    flag = true;
                }
            }
            if (flag) {
                dp[i] = 1 + max;
            } else
                dp[i] = 0;
            flag = false;
        }
        return dp[n];
    }
}
