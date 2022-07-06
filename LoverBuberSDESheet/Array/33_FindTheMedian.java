package LoverBuberSDESheet.Array;

import java.util.Arrays;

class FindTheMedian {
    public static int find_median(int[] v) {
        Arrays.sort(v);
        int n = v.length;
        if (n % 2 == 0) {
            return (v[n / 2] + v[(n / 2) - 1]) / 2;
        } else
            return v[n / 2];
    }

    public static void main(String[] args) {
        int[] v = { 2, 3, 4, 7, 8 };
        int res = find_median(v);
        System.out.println(res);
    }
}
