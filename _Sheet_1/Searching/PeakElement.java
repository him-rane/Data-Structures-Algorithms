package _Sheet_1.Searching;

public class PeakElement {
    public static int peakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                    (mid == arr.length - 1 || arr[mid + 1] <= arr[mid]))
                return arr[mid];

            else if (arr[mid + 1] >= arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
