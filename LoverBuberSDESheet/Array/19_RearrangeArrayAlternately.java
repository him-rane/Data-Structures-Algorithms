package LoverBuberSDESheet.Array;

class RearrangeArrayAlternately {
    public static void rearrange(long arr[], int n) {
        long maxElm = arr[n - 1] + 1;
        int l = 0, r = n - 1, i = 0;
        while (l <= r) {
            if (i % 2 == 1) {
                arr[i] += ((arr[l] % maxElm) * maxElm);
                l++;
            } else {
                arr[i] += ((arr[r] % maxElm) * maxElm);
                r--;
            }
            i++;
        }
        for (int j = 0; j < n; j++) {
            if (n % 2 == 0) {
                if (i % 2 == 1)
                    arr[j] %= maxElm;
                else
                    arr[j] /= maxElm;
            } else {
                if (i % 2 == 1)
                    arr[j] /= maxElm;
                else
                    arr[j] %= maxElm;
            }
        }
    }

    public static void main(String[] args) {
        long[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int n = arr.length;
        rearrange(arr, n);

        for (long val : arr) {
            System.out.print(val + " ");
        }
    }
}
