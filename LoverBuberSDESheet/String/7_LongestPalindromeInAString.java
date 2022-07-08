package LoverBuberSDESheet.String;

class LongestPalindromeInAString {
    static String longestPalin(String S) {
        int n = S.length();
        boolean[][] dp = new boolean[n][n];
        int res = 0, s = 0, e = 0;
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = true;
                } else if (g == 1) {
                    if (S.charAt(i) == S.charAt(j))
                        dp[i][j] = true;
                } else {
                    if (S.charAt(i) == S.charAt(j))
                        dp[i][j] = dp[i + 1][j - 1];
                }
                if (dp[i][j]) {
                    if ((j - i) > res) {
                        res = j - i;
                        s = i;
                        e = j;
                    }
                }

            }
        }

        return S.substring(s, e + 1);

    }

    public static void main(String[] args) {
        String S = "acabbaa";
        System.out.println(longestPalin(S));

    }
}
