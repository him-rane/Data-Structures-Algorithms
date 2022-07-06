package LoverBuberSDESheet.Array;

class PalindromicArray {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int or = a[i];
            int rev = 0;
            while (or > 0) {
                int d = or % 10;
                rev = rev * 10 + d;
                or = or / 10;
            }
            if (rev != a[i])
                return 0;
        }
        return 1;
    }
}
