package LoverBuberSDESheet.String;

class WildcardStringMatching {
    static boolean match(String str, String pat) {
        // code here

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
                    } else if (str.charAt(j - 1) == pat.charAt(i - i)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else
                        dp[i][j] = false;
                }

            }
        }

        return dp[n][m];
    }

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
                        // for (int k = 0; k <= j; k++) {
                        // if (dp[i - 1][k] == true)dp[i][j] = true;
                        // }
                    } else if (pat.charAt(i - 1) == '?')
                        dp[i][j] = dp[i - 1][j - 1];
                    else if (str.charAt(j - 1) == pat.charAt(i - 1))
                        dp[i][j] = dp[i - 1][j - 1];

                    else
                        dp[i][j] = false;

                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String pat = "g*k?";
        String str = "geeks";
        System.out.println(match(str, pat));
        System.out.println(solution(str, pat));
    }
}
