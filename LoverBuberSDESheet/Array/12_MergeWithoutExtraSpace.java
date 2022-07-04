package LoverBuberSDESheet.Array;

class MergeWithoutExtraSpace {
    public static void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int gap = (int) Math.ceil((double) (n + m) / 2.0);
        while (gap > 0) {
            int i = 0;
            int j = gap;
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
            } else {
                gap = (int) Math.ceil((double) gap / 2.0);
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 7, 8, 10 };
        int arr2[] = { 2, 3, 9 };

        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println("After merge:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
