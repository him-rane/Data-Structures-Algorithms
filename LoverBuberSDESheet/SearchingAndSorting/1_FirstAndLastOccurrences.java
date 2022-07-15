package LoverBuberSDESheet.SearchingAndSorting;

import java.util.ArrayList;

class FirstAndLastOccurrences {
    public static ArrayList<Long> find(long arr[], int n, int x) {

        int l = 0, r = n - 1;
        long firstOccur = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                firstOccur = mid;
                r = mid - 1;
            } else if (arr[mid] > x) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        l = 0;
        r = n - 1;
        long lastOccur = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                lastOccur = mid;
                l = mid + 1;
            } else if (arr[mid] > x) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }

        ArrayList<Long> list = new ArrayList<Long>();
        list.add(firstOccur);
        list.add(lastOccur);
        return list;

    }

    public static void main(String[] args) {
        long[] arr = { 1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 6 };
        int n = arr.length;
        int x = 5;
        System.out.println(find(arr, n, x));
    }
}
