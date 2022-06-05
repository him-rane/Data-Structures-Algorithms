package DynamicProgramming;

public class PrintLongestCommonSubsequence {
    public static String printLongestCommonSubsequence(String s1, String s2, int n, int m) {

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
        int i = dp.length - 1;
        int j = dp[0].length - 1;
        String res = "";

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                res = s1.charAt(i - 1) + res;
                i--;
                j--;
            } else if (dp[i][j - 1] >= dp[i - 1][j]) {
                j--;
            } else
                i--;

        }

        return res;

    }

    public static void main(String[] args) {
        String s1 = "abcgufyx";
        String s2 = "pacfdhkhggyjx";
        int n = s1.length();
        int m = s2.length();

        System.out.println(printLongestCommonSubsequence(s1, s2, n, m));
    }
}
