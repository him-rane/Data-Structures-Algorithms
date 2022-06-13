package _Sheet_1.Sorting;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public boolean findTriplets(int arr[], int n) {
        // add code here.
        Arrays.sort(arr);
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] + arr[i] == 0) {
                    return true;

                } else if (arr[l] + arr[r] + arr[i] > 0) {
                    r--;
                } else
                    l++;
            }
        }

        return false;
    }
}
