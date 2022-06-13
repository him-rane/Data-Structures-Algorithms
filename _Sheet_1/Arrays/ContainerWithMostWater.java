package _Sheet_1.Arrays;

public class ContainerWithMostWater {
    long maxArea(int A[], int len) {
        // Code Here
        int i = 0;
        int j = len - 1;

        int res = 0;
        while (i <= j) {
            if (A[i] < A[j]) {
                res = Math.max(res, A[i] * (j - i));
                i++;
            } else {
                res = Math.max(res, A[j] * (j - i));
                j--;
            }
        }

        return res;

    }
}
