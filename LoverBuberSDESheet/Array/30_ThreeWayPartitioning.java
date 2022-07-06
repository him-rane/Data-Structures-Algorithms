package LoverBuberSDESheet.Array;

class ThreeWayPartitioning {
    public static void threeWayPartition(int arr[], int a, int b) {

        int i = 0, j = 0, k = arr.length - 1;
        while (j <= k) {
            if (arr[j] < a) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[j] > b) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 2, 8, 6, 5, 4, 3, 8, 9, 0, 2, 3, 4, 5, 4, 6, 2, 7, 7 };
        int a = 4;
        int b = 6;
        threeWayPartition(arr, a, b);

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
