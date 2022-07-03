package DP;

public class RegularExpressionMatching {
    public static boolean solution(String s, String p) {
        // write your code here
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = false;
                else if (j == 0) {
                    if (p.charAt(i - 1) == '*') {
                        dp[i][j] = dp[i - 2][j];
                    }
                } else if (p.charAt(i - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(i - 1) == '*') {
                    if (p.charAt(i - 2) == '.') {
                        dp[i][j] = dp[i][j - 1] || dp[i - 2][j];
                    } else {
                        if (p.charAt(i - 2) == s.charAt(j - 1))
                            dp[i][j] = dp[i - 2][j] || dp[i][j - 1];
                        else
                            dp[i][j] = dp[i - 2][j];
                    }
                } else if (p.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        String s = "afsssssdfa";
        String p = "afs*d.a";
        boolean sol = solution(s, p);
        System.out.println(sol);

    }
}
