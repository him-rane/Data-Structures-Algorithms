package LoverBuberSDESheet.Array;

class SortArrayOf0s1sand2s {
    public static void segregateElements(int arr[], int n) {
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
        int[] arr = { 1, 0, 0, 1, 0, 2, 0, 2, 2, 1, 1, 0, 2 };
        int n = arr.length;
        segregateElements(arr, n);
    }
}
