package BinaryTree;

public class CountDistinctSubsequence {
    public static long countDistinctSubsequence(String str) {

        int n = str.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            long min = 0;
            for (int j = 1; j < i; j++) {
                if (str.charAt(j - 1) == str.charAt(i - 1)) {
                    min = dp[j - 1];
                }
            }

            dp[i] = (dp[i - 1] * 2) - min;
        }

        return (dp[n] - 1);

    }

    public static void main(String[] args) {
        String str = "adfvesrscsdg";
        long res = countDistinctSubsequence(str);
        System.out.println(res);
    }
}
