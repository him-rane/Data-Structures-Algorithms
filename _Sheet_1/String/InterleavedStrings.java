package _Sheet_1.String;

public class InterleavedStrings {
    public static boolean sol(String a, String b, String c, int n1, int n2, int n, int[][] dp) {
        if (n == 0)
            return true;
        if (n1 == 0 || n2 == 0)
            return false;

        if (dp[n1][n2] != -1) {
            if (dp[n1][n2] == 0)
                return false;
            else
                return true;
        }

        char ch1 = a.charAt(n1 - 1);
        char ch2 = b.charAt(n2 - 1);
        char ch = c.charAt(n - 1);

        if (ch == ch1 && ch == ch2) {

            boolean temp = sol(a, b, c, n1 - 1, n2, n - 1, dp) || sol(a, b, c, n1, n2 - 1, n - 1, dp);
            dp[n1][n2] = temp ? 1 : 0;
            return temp;

        }
        if (ch == ch1) {

            boolean temp = sol(a, b, c, n1 - 1, n2, n - 1, dp) || sol(a, b, c, n1, n2, n - 1, dp);
            dp[n1][n2] = temp ? 1 : 0;
            return temp;
        }
        if (ch == ch2) {
            boolean temp = sol(a, b, c, n1, n2 - 1, n - 1, dp) || sol(a, b, c, n1, n2, n - 1, dp);

            dp[n1][n2] = temp ? 1 : 0;
            return temp;
        }

        return false;
    }

    public boolean isInterLeave(String a, String b, String c) {
        // Your code here
        int n1 = a.length();
        int n2 = b.length();
        int n = c.length();

        if (n1 + n2 != n)
            return false;
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                dp[i][j] = -1;
            }
        }

        return sol(a, b, c, n1, n2, n, dp);

    }
}
