package LoverBuberSDESheet.Array;

class ReverseTheArray {
    public static void sol(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        sol(arr, n);
    }
}
