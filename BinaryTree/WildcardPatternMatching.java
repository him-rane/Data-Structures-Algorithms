package BinaryTree;

public class WildcardPatternMatching {
    public static boolean solution(String str, String pat) {
        // write your code here
        int m = str.length();
        int n = pat.length();

        boolean[][] dp = new boolean[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = true;
                else if (i == 0)
                    dp[i][j] = false;
                else if (j == 0) {
                    if (pat.charAt(i - 1) == '*')
                        dp[i][j] = dp[i - 1][j];
                    else
                        dp[i][j] = false;
                } else {
                    if (pat.charAt(i - 1) == '*') {
                        dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                    } else if (pat.charAt(i - 1) == '?') {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else if (str.charAt(j - 1) == pat.charAt(i - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String str = "qwrrdtdg";
        String pat = "qw*rt";
        boolean res = solution(str, pat);
        System.out.println(res);
    }
}
