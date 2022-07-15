package LoverBuberSDESheet.SearchingAndSorting;

class SearchInSortedRotatedArray {
    static int Search(int arr[], int tg) {
        // code here
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == tg)
                return mid;
            if (arr[l] <= arr[mid]) {
                if (arr[l] <= tg && tg < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {

                if (arr[mid] < tg && tg <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int tg = 10;
        System.out.println(Search(arr, tg));
    }
}
