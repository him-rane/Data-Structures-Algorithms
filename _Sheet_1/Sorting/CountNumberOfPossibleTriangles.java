package _Sheet_1.Sorting;

import java.util.Arrays;

public class CountNumberOfPossibleTriangles {
    static int findNumberOfTriangles(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    count += (r - l);
                    r--;
                } else
                    l++;
            }
        }

        return count;
    }
}
