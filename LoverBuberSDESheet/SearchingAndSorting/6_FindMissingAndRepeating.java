package LoverBuberSDESheet.SearchingAndSorting;

class FindMissingAndRepeating {
    public static int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]);
            if (arr[idx - 1] < 0)
                ans[0] = idx;
            arr[idx - 1] = -Math.abs(arr[idx - 1]);

        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[1] = i + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        int n = arr.length;
        int[] ans = findTwoElement(arr, n);
        for (int val : ans)
            System.out.println(ans);
    }
}
