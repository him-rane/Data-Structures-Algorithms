package LoverBuberSDESheet.Matrix;

class RotateBy90Degree {
    public static void rotate(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int j = 0; j < m; j++) {
            int l = 0, h = n - 1;
            while (l <= h) {
                int temp = mat[l][j];
                mat[l][j] = mat[h][j];
                mat[h][j] = temp;
                l++;
                h--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };

        rotate(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
