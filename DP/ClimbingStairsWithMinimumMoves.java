package DP;

public class ClimbingStairsWithMinimumMoves {
    static int minJumps(int[] arr) {
        // your code here
        int n = arr.length;
        if (n == 1)
            return 0;
        if (arr[0] == 0)
            return -1;

        int maxR = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps;
            maxR = Math.max(maxR, i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxR)
                    return -1;
                steps = maxR - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] jumps = { 3, 2, 4, 0, 20, 2, 3, 1, 2, 2 };

        // int res = minimumJumps(jumps);
        // System.out.println(res);
    }
}
