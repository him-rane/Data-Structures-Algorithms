package DynamicProgramming;

public class convertString {
    public static void convertString(String s1, String s2, int n, int m) {
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
        int len = dp[n][m];

        System.out.println("Delete = " + (n - len));
        System.out.println("Insert = " + (m - len));

    }

    public static void main(String[] args) {
        String s1 = "heap";
        String s2 = "pea";
        int n = s1.length();
        int m = s2.length();

        convertString(s1, s2, n, m);
    }
}
