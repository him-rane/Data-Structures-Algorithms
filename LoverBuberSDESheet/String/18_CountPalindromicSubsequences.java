package LoverBuberSDESheet.String;

class CountPalindromicSubsequences {
    static long m = 1000000007;

    public static long countPS(String s) {

        int n = s.length();
        String rs = "";
        for (int i = 0; i < n; i++) {
            rs = s.charAt(i) + rs;
        }
        long[][] dp = new long[n][n];
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0)
                    dp[i][j] = 1;
                else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j))
                        dp[i][j] = 3;
                    else
                        dp[i][j] = 2;
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = ((dp[i + 1][j] + dp[i][j - 1]) % m + 1) % m;
                    } else
                        dp[i][j] = (((dp[i + 1][j] + dp[i][j - 1]) % m) - dp[i + 1][j - 1]) % m;
                }
                if (dp[i][j] < 0)
                    dp[i][j] += m;
            }
        }

        return (dp[0][n - 1]) % m;
    }

    public static void main(String[] args) {
        String s = "jdoaijsfndsioaoejrwejrlnaahhimauehddptahadikwihojayehabsissbarakyakya";
        long res = countPS(s);
        System.out.println(res);
    }
}
