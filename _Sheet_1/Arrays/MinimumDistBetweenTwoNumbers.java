package _Sheet_1.Arrays;

public class MinimumDistBetweenTwoNumbers {
    int minDist(int a[], int n, int x, int y) {
        int idx1 = -1, idx2 = -1, min_dist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            if (a[i] == x) {
                idx1 = i;
            }

            else if (a[i] == y) {
                idx2 = i;
            }

            if (idx1 != -1 && idx2 != -1)
                min_dist = Math.min(min_dist, Math.abs(idx1 - idx2));
        }

        if (idx1 == -1 || idx2 == -1)
            return -1;

        else
            return min_dist;
    }
}
