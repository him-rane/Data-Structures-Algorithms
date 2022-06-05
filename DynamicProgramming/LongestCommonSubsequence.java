package DynamicProgramming;

public class LongestCommonSubsequence {

    public static int solRec(String s1, String s2, int n, int m) {
        if (n == 0 && m == 0)
            return 1;
        if (n == 0 || m == 0)
            return 0;
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + solRec(s1, s2, n - 1, m - 1);
        }
        return Math.max(solRec(s1, s2, n - 1, m), solRec(s1, s2, n, m - 1));
    }

    public static int solTopDown(String s1, String s2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0)
                    dp[i][j] = 1;
                else if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        String s1 = "abcgufdgyggh";
        String s2 = "pacfdtfhufyd";
        int n = s1.length();
        int m = s2.length();

        System.out.println(solRec(s1, s2, n, m));
        System.out.println(solTopDown(s1, s2, n, m));
    }
}
