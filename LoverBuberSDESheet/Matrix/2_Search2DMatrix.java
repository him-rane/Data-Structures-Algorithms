package LoverBuberSDESheet.Matrix;

class Search2DMatrix {
    public static boolean searchMatrix(int[][] mat, int tg) {
        int n = mat.length;
        int m = mat[0].length;

        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (mat[i][j] == tg)
                return true;

            if (mat[i][j] > tg) {
                j--;
            } else {
                i++;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int[][] mat = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int tg = 16;
        System.out.println(searchMatrix(mat, tg));
    }

}
