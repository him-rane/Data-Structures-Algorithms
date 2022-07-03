package DP;

public class LongestRepeatingSubsequence {
    public static int solution(String str) {
        int n = str.length();

        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if ((i != j) && (str.charAt(i - 1) == str.charAt(j - 1))) {
                    dp[i][j] += (1 + dp[i - 1][j - 1]);
                } else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }

        return dp[n][n];
    }

    public static void main(String[] args) {
        String str = "urbfiifbf";
        System.out.println(solution(str));
    }
}
