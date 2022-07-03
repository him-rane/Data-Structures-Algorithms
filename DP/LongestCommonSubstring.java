package DP;

public class LongestCommonSubstring {

    public static int solution(String s1, String s2) {
        // write your code here
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n + 1][m + 1];

        int maxLen = 0;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] += (1 + dp[i - 1][j - 1]);
                }
                maxLen = Math.max(maxLen, dp[i][j]);

            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s1 = "asnrds";
        String s2 = "rusbwp";

        System.out.println(solution(s1, s2));
    }
}
