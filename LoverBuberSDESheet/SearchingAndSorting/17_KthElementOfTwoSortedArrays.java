package LoverBuberSDESheet.SearchingAndSorting;

class KthElementOfTwoSortedArrays {
    public static long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int i = 0, j = 0;
        while (i < n && j < m) {
            k--;
            if (arr1[i] < arr2[j]) {
                if (k == 0)
                    return arr1[i];
                i++;
            } else {
                if (k == 0)
                    return arr2[j];
                j++;
            }

        }

        while (i < n) {
            k--;
            if (k == 0)
                return arr1[i];
            i++;

        }

        while (j < m) {
            k--;
            if (k == 0)
                return arr2[j];
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 5, 7, 8 };
        int[] arr2 = { 4, 6, 8, 9, 12 };
        int n = arr1.length;
        int m = arr2.length;
        int k = 4;
        System.out.println(kthElement(arr1, arr2, n, m, k));

    }
}
