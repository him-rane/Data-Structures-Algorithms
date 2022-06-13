package _Sheet_1.Sorting;

public class MergeSort {
    void merge(int arr[], int l, int m, int r) {
        // Your code here
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int idx = l;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[idx] = arr1[i];
                i++;
            } else {
                arr[idx] = arr2[j];
                j++;
            }

            idx++;
        }

        while (i < n1) {
            arr[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < n2) {
            arr[idx] = arr2[j];
            j++;
            idx++;
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);

        }
    }
}
