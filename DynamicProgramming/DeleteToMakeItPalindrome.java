package DynamicProgramming;

public class DeleteToMakeItPalindrome {
    public static int longestPalindromicSubsequence(String s) {
        String rs = "";
        for (int i = 0; i < s.length(); i++) {
            rs = s.charAt(i) + rs;
        }
        int n = s.length();
        int m = rs.length();
        return solTopDown(s, rs, n, m);
    }

    public static int solTopDown(String s1, String s2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static int deleteToMakeItPalindrome(String s) {
        int temp = longestPalindromicSubsequence(s);
        return (s.length() - temp);
    }

    public static void main(String[] args) {
        String s = "agbcba";
        System.out.println(deleteToMakeItPalindrome(s));
    }
}
