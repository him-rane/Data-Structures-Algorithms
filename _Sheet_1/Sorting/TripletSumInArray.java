package _Sheet_1.Sorting;

import java.util.Arrays;

public class TripletSumInArray {
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (A[l] + A[r] + A[i] == X) {
                    return true;

                } else if (A[l] + A[r] + A[i] > X) {
                    r--;
                } else
                    l++;
            }
        }
        return false;
    }
}
