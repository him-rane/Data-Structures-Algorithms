package _Sheet_1.Sorting;

public class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        // code here
        if (low < high) {
            int m = partition(arr, low, high);
            quickSort(arr, low, m);
            quickSort(arr, m + 1, high);

        }
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int i = low - 1;
        int j = high + 1;
        int pivot = arr[low];
        while (true) {
            do {
                i++;
            } while (pivot > arr[i]);
            do {
                j--;
            } while (pivot < arr[j]);

            if (i >= j)
                return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }
}
