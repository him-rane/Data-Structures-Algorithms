package LoverBuberSDESheet.Array;

class CountInversions {
    public static long merge(long[] arr, long l, long m, long r) {
        long n1 = m - l + 1;
        long n2 = r - m;

        long[] left = new long[(int) n1];
        long[] right = new long[(int) n2];

        for (int i = 0; i < n1; i++) {
            left[(int) i] = arr[(int) (i + l)];
        }

        for (int i = 0; i < n2; i++) {
            right[(int) i] = arr[(int) (m + i + 1)];
        }

        long count = 0;
        long i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[(int) i] <= right[(int) j]) {
                arr[(int) k] = left[(int) i];
                i++;
            } else {
                count += (n1 - i);
                arr[(int) k] = right[(int) j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[(int) k] = left[(int) i];
            i++;
            k++;

        }
        while (j < n2) {
            arr[(int) k] = right[(int) j];
            j++;
            k++;
        }
        return count;
    }

    public static long mergeSort(long[] arr, long i, long j) {
        long res = 0;
        if (j > i) {
            long m = (i + j) / 2;

            res += mergeSort(arr, i, m);
            res += mergeSort(arr, m + 1, j);
            res += merge(arr, i, m, j);

        }

        return res;
    }

    static long inversionCount(long arr[], long N) {
        // Your Code Here
        return mergeSort(arr, 0, N - 1);

    }

    public static void main(String[] args) {
        long[] arr = { 2, 3, 1, 6, 2, 3, 5, 4, 7, 8 };
        long N = arr.length;
        long res = inversionCount(arr, N);
        System.out.println(res);

    }
}
