package LoverBuberSDESheet.Array;

import java.util.Arrays;

class TripletSumInArray {
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);

        for (int i = 0; i < n; i++) {
            if (A[i] < X) {
                int l = 0, r = i - 1;
                while (l < r) {
                    if (A[i] + A[l] + A[r] == X)
                        return true;

                    if (A[i] + A[l] + A[r] < X) {
                        l++;
                    } else
                        r--;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] A = { 2, 3, 1, 4, 5, 1, 3, 4, 5, 6, 7, 8 };
        int n = A.length;
        int X = 11;
        System.out.println(find3Numbers(A, n, X));

    }
}
