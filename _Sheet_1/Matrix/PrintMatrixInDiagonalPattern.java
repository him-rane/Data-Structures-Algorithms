package _Sheet_1.Matrix;

public class PrintMatrixInDiagonalPattern {
    public static int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int idx = 0;
        int[] res = new int[n * m];
        boolean reverse = true;

        for (int i = 0; i < n; i++) {
            int j = i;
            int k = 0;
            while (j >= 0 && k <= i) {
                if (reverse)
                    res[idx] = mat[j][k];

                else
                    res[idx] = mat[k][j];
                idx++;
                j--;
                k++;
            }
            reverse = !reverse;
        }
        for (int i = 1; i < n; i++) {
            int j = i;
            int k = n - 1;
            while (k >= 1 && j <= n - 1) {
                if (!reverse)
                    res[idx] = mat[j][k];

                else
                    res[idx] = mat[k][j];
                idx++;
                j++;
                k--;
            }
            reverse = !reverse;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },

        };

        int[] arr = matrixDiagonally(mat);
        for (int val : arr)
            System.out.print(val + " ");

    }
}
