package _Sheet_1.Matrix;

import java.util.ArrayList;

public class SpiralMatrixNthele {
    int findK(int A[][], int n, int m, int k) {
        int r = n;
        int c = m;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, right = c - 1, buttom = r - 1, left = 0;
        while (top <= buttom && left <= right) {
            for (int i = top; i <= right; i++) {
                list.add(A[top][i]);
                count++;
                if (count == k)
                    return A[top][i];
            }
            top++;
            for (int i = top; i <= buttom; i++) {
                list.add(A[i][right]);
                count++;
                if (count == k)
                    return A[i][right];
            }
            right--;

            if (top <= buttom) {
                for (int i = right; i >= left; i--) {
                    list.add(A[buttom][i]);
                    count++;
                    if (count == k)
                        return A[buttom][i];
                }
                buttom--;
            }

            if (left <= right) {
                for (int i = buttom; i >= top; i--) {
                    list.add(A[i][left]);
                    count++;
                    if (count == k)
                        return A[i][left];
                }
                left++;
            }
        }
        return 1;
    }
}
