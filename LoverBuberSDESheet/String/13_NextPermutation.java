package LoverBuberSDESheet.String;

import java.util.ArrayList;
import java.util.List;

class NextPermutation {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static List<Integer> nextPermutation(int N, int arr[]) {
        int i = N - 1;
        while (i > 0 && arr[i - 1] >= arr[i])
            i--;
        i--;

        if (i >= 0) {
            int j = N - 1;
            while (j > 0 && arr[j] <= arr[i])
                j--;

            swap(arr, i, j);

        }

        reverse(arr, i + 1, N - 1);
        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            list.add(val);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5 };
        int N = arr.length;
        System.out.println(nextPermutation(N, arr));
    }
}
