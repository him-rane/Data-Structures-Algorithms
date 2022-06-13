package _Sheet_1.Sorting;

public class Closet0s1sand2s {
    public static void segragate012(int arr[], int N) {
        int i = 0;
        int j = 0;
        int k = N - 1;
        while (j <= k) {
            if (arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            } else if (arr[j] == 2) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;

                k--;
            } else
                j++;
        }
    }
}
