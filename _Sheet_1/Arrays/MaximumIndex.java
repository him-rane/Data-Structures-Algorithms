package _Sheet_1.Arrays;

public class MaximumIndex {
    static int maxIndexDiff(int A[], int N) {

        // Your code here
        int[] minL = new int[N];
        int[] maxR = new int[N];

        minL[0] = A[0];
        for (int i = 1; i < N; i++) {
            minL[i] = Math.min(minL[i - 1], A[i]);
        }

        maxR[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            maxR[i] = Math.max(maxR[i + 1], A[i]);
        }

        int i = 0, j = 0;
        int maxDiff = -1;

        while (i < N && j < N) {
            if (minL[i] <= maxR[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;

    }
}
