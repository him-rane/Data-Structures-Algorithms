package Array;

public class SortArrayOf0s1sAnd2s {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort012(int a[], int n) {
        int i = 0, j = 0, k = n - 1;
        while (j <= k) {
            if (a[j] == 0) {
                swap(a, i, j);
                i++;
                j++;
            } else if (a[j] == 1) {
                j++;
            } else if (a[j] == 2) {
                swap(a, k, j);
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 0, 2, 1, 1, 0, 0, 2, 2, 2, 1 };
        int n = a.length;
        sort012(a, n);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
