package LoverBuberSDESheet.SearchingAndSorting;

import java.util.Arrays;

class CountTripletsWithSumSmallerThanX {
    static long countTriplets(long arr[], int n, int sum) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;

            while (l < r) {
                if (arr[i] + arr[l] + arr[r] < sum) {
                    count += (r - l);
                    l++;
                } else {
                    r--;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        long[] arr = { 2, -5, 6, 1, 7, 3, -4, -3, 9, 8 };
        int sum = 10;
        int n = arr.length;
        long res = countTriplets(arr, n, sum);
        System.out.println(res);
    }

}
