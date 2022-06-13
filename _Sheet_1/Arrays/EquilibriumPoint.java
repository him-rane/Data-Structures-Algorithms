package _Sheet_1.Arrays;

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        if (n == 2)
            return -1;
        if (n == 1)
            return 1;

        // Your code here
        int i = 0;
        int j = n - 1;
        int sum1 = 0;
        int sum2 = 0;

        while (i < j) {
            if (sum1 == sum2) {
                sum1 += arr[i];
                sum2 += arr[j];

                i++;
                j--;
            } else if (sum1 > sum2) {
                sum2 += arr[j];
                j--;

            } else {
                sum1 += arr[i];
                i++;
            }
        }
        if (j != i + 1 && sum1 == sum2)
            return j + 1;
        return -1;
    }
}
