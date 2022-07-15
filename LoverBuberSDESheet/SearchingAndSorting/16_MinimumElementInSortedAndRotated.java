package LoverBuberSDESheet.SearchingAndSorting;

class MinimumElementInSortedAndRotated {
    static int findMin(int arr[], int n) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mid == r)
                return arr[mid];
            if (arr[mid] == arr[r])
                r--;
            else if (arr[mid] < arr[r]) {
                r = mid;
            } else
                l = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        int n = arr.length;
        System.out.println(findMin(arr, n));
    }
}
