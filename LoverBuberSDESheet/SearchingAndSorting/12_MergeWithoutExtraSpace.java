package LoverBuberSDESheet.SearchingAndSorting;

class MergeWithoutExtraSpace {
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int gap = (int) Math.ceil((double) (n + m) / 2.0);
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < (n + m)) {
                if (j < n && arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                } else if (j >= n && i < n && arr1[i] > arr2[j - n]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j - n];
                    arr2[j - n] = temp;
                } else if (j >= n && i >= n && arr2[i - n] > arr2[j - n]) {
                    int temp = arr2[i - n];
                    arr2[i - n] = arr2[j - n];
                    arr2[j - n] = temp;
                }

                j++;
                i++;
            }
            if (gap == 1) {
                gap = 0;
            } else
                gap = (int) (Math.ceil((double) gap / 2.0));
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8 };
        int[] arr2 = { 3, 4, 7, 8, 9 };
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n, m);
        for (int val : arr1)
            System.out.print(val + " ");
        for (int val : arr2)
            System.out.print(val + " ");

    }
}
