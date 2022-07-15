package LoverBuberSDESheet.SearchingAndSorting;

class SticklerThief {
    public static int findMaxSum(int arr[], int n) {
        // Your code here
        if (n == 1)
            return arr[0];
        else if (n == 2)
            return Math.max(arr[0], arr[1]);
        else if (n == 3)
            return Math.max(arr[1], arr[0] + arr[2]);

        arr[2] += arr[0];
        for (int i = 3; i < n; i++) {
            arr[i] += Math.max(arr[i - 2], arr[i - 3]);
        }

        return Math.max(arr[n - 1], arr[n - 2]);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 7, 6, 5, 4, 3, 9, 8, 6, 4, 8, 2, 5 };
        int n = arr.length;
        int res = findMaxSum(arr, n);

        System.out.println(res);

    }
}
