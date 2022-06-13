package _Sheet_1.Searching;

public class FloorInSortedArray {
    static int findFloor(long arr[], int n, long x) {
        long left = 0;
        long right = n - 1;

        int res = -1;

        while (left <= right) {
            int mid = (int) (left + (right - left) / 2);

            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}
