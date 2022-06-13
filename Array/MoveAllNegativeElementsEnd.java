package Array;

public class MoveAllNegativeElementsEnd {
    public static void segregateElements(int arr[], int n) {
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] >= 0)
                temp[j++] = arr[i];
        if (j == n || j == 0)
            return;
        for (int i = 0; i < n; i++)
            if (arr[i] < 0)
                temp[j++] = arr[i];
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = { -1, 3, -4, 5, -3, 4, -9, };
        int n = arr.length;
        segregateElements(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
