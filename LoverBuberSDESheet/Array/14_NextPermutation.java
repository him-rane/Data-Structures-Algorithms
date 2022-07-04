package LoverBuberSDESheet.Array;

import java.util.ArrayList;

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

    static ArrayList<Integer> nextPermutation(int N, int arr[]) {
        // code here
        int i = N - 1;
        while (i > 0 && arr[i - 1] >= arr[i])
            i--;
        i--;
        // System.out.println(arr[i]);
        int j = i;
        if (j >= 0) {
            int val = arr[j];
            j = N - 1;
            while (j >= 0 && arr[j] <= val)
                j--;

            swap(arr, i, j);

        }

        reverse(arr, i + 1, N - 1);

        ArrayList<Integer> list = new ArrayList<>();
        for (int val : arr) {
            list.add(val);
        }

        return list;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 5, 6 };
        int N = arr.length;
        System.out.println(nextPermutation(N, arr));
    }
}
