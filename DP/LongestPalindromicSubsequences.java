package DP;

public class LongestPalindromicSubsequences {
    public static int longestPalindromicSubsequence(String s) {
        String rs = "";
        for (int i = 0; i < s.length(); i++) {
            rs = s.charAt(i) + rs;
        }

        int n = s.length();
        int m = rs.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                if (s.charAt(i - 1) == rs.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return (dp[n][m]);
    }

    public static void main(String[] args) {
        String s = "abdushdyegasdfhasf";
        System.out.println(longestPalindromicSubsequence(s));
    }
}
