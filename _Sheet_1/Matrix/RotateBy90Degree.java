package _Sheet_1.Matrix;

public class RotateBy90Degree {
    static void rotate(int matrix[][]) {
        // Code Here
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int j = 0; j < m; j++) {
            int l = 0, r = m - 1;

            while (l <= r) {
                int temp = matrix[l][j];
                matrix[l][j] = matrix[r][j];
                matrix[r][j] = temp;
                l++;
                r--;
            }
        }

    }
}
