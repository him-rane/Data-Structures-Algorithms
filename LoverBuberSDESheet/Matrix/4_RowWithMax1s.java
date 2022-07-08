package LoverBuberSDESheet.Matrix;

class RowWithMax1s {
    public static int rowWithMax1s(int arr[][], int n, int m) {
        int i = 0, j = m - 1;
        int ans = -1;
        while (true) {
            if (i == n)
                return ans;
            if (j == -1)
                return i;
            if (arr[i][j] == 1) {
                j--;
                ans = i;
            } else if (arr[i][j] == 0) {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1, 1 }, { 0, 1, 1, 1 }, { 0, 0, 0, 1 }, { 0, 0, 1, 1 } };
        int n = arr.length;
        int m = arr[0].length;
        int res = rowWithMax1s(arr, n, m);

        System.out.println(res);
    }
}
