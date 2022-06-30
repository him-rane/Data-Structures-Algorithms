package DP;

import java.util.ArrayDeque;

public class LongestIncreasingSubsequence {
    public static class Pair {
        int l;
        int i;
        int v;
        String psf;

        Pair(int l, int i, int v, String psf) {
            this.l = l;
            this.i = i;
            this.v = v;
            this.psf = psf;
        }
    }

    public static void longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 1;

        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            if (dp[i] > maxVal) {
                maxVal = dp[i];
            }

        }
        System.out.println(maxVal);

        ArrayDeque<Pair> q = new ArrayDeque<>();
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == maxVal)
                q.add(new Pair(maxVal, i, arr[i], arr[i] + ""));
        }

        while (q.size() > 0) {
            Pair rem = q.poll();
            if (rem.l == 1) {
                System.out.println(rem.psf);
            }
            for (int i = rem.i - 1; i >= 0; i--) {
                if (rem.l - 1 == dp[i] && arr[i] <= rem.v) {
                    q.add(new Pair(dp[i], i, arr[i], arr[i] + " -> " + rem.psf));
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 1 };
        longestIncreasingSubsequence(arr);

    }
}
