package Array;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
