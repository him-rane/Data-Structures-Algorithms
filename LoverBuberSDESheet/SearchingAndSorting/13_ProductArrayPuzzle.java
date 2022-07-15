package LoverBuberSDESheet.SearchingAndSorting;

class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) {
        long[] prePro = new long[n];
        prePro[0] = 1;
        for (int i = 1; i < n; i++) {
            prePro[i] = prePro[i - 1] * nums[i - 1];
        }

        long[] nxtPro = new long[n];
        nxtPro[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            nxtPro[i] = nums[i + 1] * nxtPro[i + 1];
        }

        for (int i = 0; i < n; i++) {
            nxtPro[i] *= prePro[i];
        }

        return nxtPro;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 2, 7, 1, 8 };

    }
}
