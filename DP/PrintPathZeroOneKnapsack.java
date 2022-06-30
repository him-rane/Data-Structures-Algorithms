package DP;

import java.util.ArrayDeque;

public class PrintPathZeroOneKnapsack {
    static class Pair {
        int i;
        int j;
        String psf;

        public Pair(int i, int j, String psf) {
            this.i = i;
            this.j = j;
            this.psf = psf;
        }
    }

    public static void printPath(int[] val, int[] wt, int n, int cap) {
        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= wt[i - 1]) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        System.out.println(dp[dp.length - 1][dp[0].length - 1]);

        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(dp.length - 1, dp[0].length - 1, ""));
        while (q.size() > 0) {
            Pair rem = q.poll();

            if (rem.i == 0 || rem.j == 0) {
                System.out.println(rem.psf);
            } else if (rem.j >= wt[rem.i - 1]) {
                int max = Math.max(dp[rem.i - 1][rem.j - wt[rem.i - 1]], dp[rem.i - 1][rem.j]);

                if (max == dp[rem.i - 1][rem.j - wt[rem.i - 1]]) {
                    q.add(new Pair(rem.i - 1, rem.j - wt[rem.i - 1], rem.psf + " " + (rem.i - 1)));
                }
                if (max == dp[rem.i - 1][rem.j]) {
                    q.add(new Pair(rem.i - 1, rem.j, rem.psf));
                }
            } else {
                q.add(new Pair(rem.i - 1, rem.j, rem.psf));
            }
        }

        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // System.out.print(dp[i][j] + " ");
        // }
        // System.out.println();
        // }

    }

    public static void main(String[] args) {
        // 5
        // 15 14 10 45 30
        // 2 5 1 3 4
        // 7
        int[] val = { 15, 14, 10, 45, 30 };
        int[] wt = { 2, 5, 1, 3, 4 };
        int n = wt.length;
        int cap = 7;
        printPath(val, wt, n, cap);
    }
}
