package LoverBuberSDESheet.String;

class EditDistance {
    public static int rec(String text, String pat, int n, int m, int[][] dp) {
        if (m < 0)
            return n + 1;
        else if (n < 0) {
            return m + 1;
        }
        if (dp[n][m] != 0)
            return dp[n][m];

        if (text.charAt(n) == pat.charAt(m)) {
            return dp[n][m] = rec(text, pat, n - 1, m - 1, dp);
        } else {
            int delete = 1 + rec(text, pat, n, m - 1, dp);
            int insert = 1 + rec(text, pat, n - 1, m, dp);
            int replace = 1 + rec(text, pat, n - 1, m - 1, dp);

            return dp[n][m] = Math.min(replace, Math.min(delete, insert));
        }
    }

    public static int editDistance(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        return rec(s, t, n - 1, m - 1, dp);
    }

    public static void main(String[] args) {
        String text = "ros";
        String pat = "horse";
        System.out.println(editDistance(text, pat));

    }
}
