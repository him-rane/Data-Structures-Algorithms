package DynamicProgramming;

public class PalindromePartitioning {
    public static boolean isPelindrom(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int palindromePartitioningRec(String s, int i, int j) {

        if (i >= j || isPelindrom(s, i, j))
            return 0;
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int temp = 1 + palindromePartitioningRec(s, i, k) + palindromePartitioningRec(s, k + 1, j);
            min = Math.min(min, temp);
        }
        return min;
    };

    public static int palindromePartitioningTab(String s, int i, int j, int[][] dp) {

        if (i >= j || isPelindrom(s, i, j))
            return 0;

        if (dp[i][j] != 0)
            return dp[i][j];

        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int left = 0;
            if (dp[i][k] != 0) {
                left = dp[i][k];
            } else
                left = palindromePartitioningTab(s, i, k, dp);

            int right = 0;
            if (dp[k + 1][j] != 0) {
                right = dp[k + 1][j];
            } else
                right = palindromePartitioningTab(s, k + 1, j, dp);

            int temp = 1 + left + right;
            min = Math.min(min, temp);
        }

        return dp[i][j] = min;
    };

    public static void main(String[] args) {
        String s = "ababbbabbabdfds";
        int n = s.length();
        System.out.println(palindromePartitioningRec(s, 0, n - 1));

        int[][] dp = new int[n + 1][n + 1];
        System.out.println(palindromePartitioningTab(s, 0, n - 1, dp));

    }
}
