package DynamicProgramming;

public class EqualSumPartition {

    public static boolean equalSumPartition(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 1)
            return false;
        else
            sum = sum / 2;

        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0)
                    return true;
                else if (j == 0)
                    return true;
                else if (i == 0)
                    return false;

                else if (j >= arr[i - 1]) {
                    return dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[dp.length][dp[0].length];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 1, 2, 5 };
        System.out.println(equalSumPartition(arr));
    }
}
