package _Sheet_1.Sorting;

public class CountInversions {
    public static long merge(long arr[], int l, int m, int r) {
        long count = 0;
        int n1 = m - l + 1;
        int n2 = r - m;

        long[] left = new long[n1];
        long[] right = new long[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int idx = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[idx] = left[i];
                i++;
            } else {
                arr[idx] = right[j];
                j++;
                count += (n1 - i);
            }

            idx++;
        }

        while (i < n1) {
            arr[idx] = left[i];
            i++;
            idx++;
            // count++;
        }
        while (j < n2) {
            arr[idx] = right[j];
            j++;
            idx++;
        }
        return count;

    }

    public static long mergeSort(long[] arr, int l, int r) {
        long res = 0;
        if (r > l) {
            int m = (l + r) / 2;
            res += mergeSort(arr, l, m);
            res += mergeSort(arr, m + 1, r);
            res += merge(arr, l, m, r);
        }
        return res;
    }

    static long inversionCount(long arr[], long N) {
        // Your Code Here
        return mergeSort(arr, 0, arr.length - 1);
    }
}
