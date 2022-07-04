package LoverBuberSDESheet.Array;

class CyclicallyRotateAnArrayByOne {
    public static void rotate(int arr[], int n) {
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 3, 4, 5 };
        int n = arr.length;
        rotate(arr, n);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
