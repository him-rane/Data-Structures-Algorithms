package DP;

public class CountOfValleysAndMountains {
    public static int countOfValleysAndMountains(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int j = 0, k = i - 1;
            while (j < i) {
                dp[i] += (dp[j] * dp[k]);
                j++;
                k--;
            }

        }
        return (dp[n]);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(countOfValleysAndMountains(n));
    }
}
