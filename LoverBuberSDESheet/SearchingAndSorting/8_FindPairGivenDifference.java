package LoverBuberSDESheet.SearchingAndSorting;

import java.util.Arrays;

class FindPairGivenDifference {
    public static boolean findPair(int arr[], int n, int x) {
        Arrays.sort(arr);
        int i = 1, j = 0;
        while (i < n && j < n) {
            int diff = arr[i] - arr[j];
            if (i == j)
                i++;
            else if (diff == x)
                return true;
            else if (diff < x) {
                i++;
            } else
                j++;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 19, 8, 2, 7, 13, 10, 14 };
        int n = arr.length;
        int x = 3;

        System.out.println(findPair(arr, n, x));
    }
}
