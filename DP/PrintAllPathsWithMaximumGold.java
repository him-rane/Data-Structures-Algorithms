package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PrintAllPathsWithMaximumGold {

    private static class Pair {
        String psf;
        int i;
        int j;

        public Pair(String psf, int i, int j) {
            this.psf = psf;
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str.split(" ")[j]);
            }
        }

        // write your code here
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            dp[i][m - 1] = arr[i][m - 1];
        }

        for (int j = m - 2; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                else if (i == n - 1)
                    dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j + 1], dp[i][j + 1]);
                else
                    dp[i][j] = arr[i][j] + Math.max(Math.max(dp[i - 1][j + 1], dp[i][j + 1]), dp[i + 1][j + 1]);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i][0]);
        }
        System.out.println(max);

        ArrayDeque<Pair> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (dp[i][0] == max)
                q.add(new Pair(i + "", i, 0));
        }
        while (q.size() > 0) {
            Pair rem = q.removeFirst();

            if (rem.j == m - 1) {
                System.out.println(rem.psf);
            } else if (rem.i == 0) {
                int mi = Math.max(dp[rem.i][rem.j + 1], dp[rem.i + 1][rem.j + 1]);
                if (mi == dp[rem.i][rem.j + 1]) {
                    q.add(new Pair(rem.psf + " d2", rem.i, rem.j + 1));
                }
                if (mi == dp[rem.i + 1][rem.j + 1]) {
                    q.add(new Pair(rem.psf + " d3", rem.i + 1, rem.j + 1));
                }

            } else if (rem.i == n - 1) {
                int mi = Math.max(dp[rem.i][rem.j + 1], dp[rem.i - 1][rem.j + 1]);
                if (mi == dp[rem.i][rem.j + 1]) {
                    q.add(new Pair(rem.psf + " d2", rem.i, rem.j + 1));
                }
                if (mi == dp[rem.i - 1][rem.j + 1]) {
                    q.add(new Pair(rem.psf + " d1", rem.i - 1, rem.j + 1));
                }

            } else {
                int mi = Math.max(dp[rem.i][rem.j + 1],
                        Math.max(dp[rem.i - 1][rem.j + 1], dp[rem.i + 1][rem.j + 1]));

                if (mi == dp[rem.i - 1][rem.j + 1]) {
                    q.add(new Pair(rem.psf + " d1", rem.i - 1, rem.j + 1));
                }
                if (mi == dp[rem.i][rem.j + 1]) {
                    q.add(new Pair(rem.psf + " d2", rem.i, rem.j + 1));
                }
                if (mi == dp[rem.i + 1][rem.j + 1]) {
                    q.add(new Pair(rem.psf + " d3", rem.i + 1, rem.j + 1));
                }

            }
        }

    }

}
