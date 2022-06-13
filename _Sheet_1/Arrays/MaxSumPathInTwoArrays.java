package _Sheet_1.Arrays;

public class MaxSumPathInTwoArrays {
    public static int maxPathSum(int ar1[], int ar2[]) {
        int n = ar1.length;
        int m = ar2.length;
        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        int maxSum = 0;
        while (i < n && j < m) {
            if (ar1[i] < ar2[j]) {
                sum1 += ar1[i];
                i++;
            } else if (ar1[i] > ar2[j]) {
                sum2 += ar2[j];
                j++;
            } else {
                maxSum += (ar1[i] + Math.max(sum1, sum2));
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while (i < n) {
            sum1 += ar1[i];
            i++;
        }
        while (j < m) {
            sum2 += ar2[j];
            j++;
        }
        maxSum += Math.max(sum1, sum2);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] ar1 = { 1, 2, 5 };
        int[] ar2 = { 5, 8, 9 };
        maxPathSum(ar1, ar2);
    }
}
