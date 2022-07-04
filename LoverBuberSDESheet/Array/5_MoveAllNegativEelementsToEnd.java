package LoverBuberSDESheet.Array;

class MoveAllNegativEelementsToEnd {
    public static void segregateElements(int arr[], int n) {
        // Your code goes here
        int[] temp = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {

            arr[i] = temp[i];

        }
    }

    public static void main(String[] args) {
        int[] arr = { 17, 0, 7, 1, -3, -2, 0, 2, 12, 11, 10, -20, 2 };
        int n = arr.length;
        segregateElements(arr, n);
    }
}
