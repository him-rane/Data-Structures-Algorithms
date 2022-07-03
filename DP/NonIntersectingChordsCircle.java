package DP;

public class NonIntersectingChordsCircle {
    public static long nonIntersectingChordsCircle(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int l = 0, r = i - 1;
            while (l < i) {
                dp[i] += (dp[l] * dp[r]);
                l++;
                r--;
            }
        }
        return (dp[n]);
    }

    public static void main(String[] args) {
        int n = 8;
        long res = nonIntersectingChordsCircle(n);
        System.out.println(res);
    }
}
