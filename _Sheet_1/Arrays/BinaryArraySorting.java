package _Sheet_1.Arrays;

public class BinaryArraySorting {
    static int[] SortBinaryArray(int arr[], int n) {
        int i = -1, j = n;
        while (true) {
            do {
                i++;
            } while (i < n && arr[i] == 0);
            do {
                j--;
            } while (j > 0 && arr[j] == 1);
            if (i >= j)
                break;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
