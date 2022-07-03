package DP;

public class WaysOfPolygonTriangulation {
    public static int waysOfPolygonTriangulation(int n) {
        n = n - 2;
        int[] dp = new int[n + 1];

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
        System.out.println(waysOfPolygonTriangulation(9));
    }
}
