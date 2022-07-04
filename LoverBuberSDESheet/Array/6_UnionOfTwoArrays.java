package LoverBuberSDESheet.Array;

import java.util.HashSet;

class UnionOfTwoArrays {
    public static int doUnion(int a[], int n, int b[], int m) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 1, 2, 3 };
        int n = a.length;
        int[] b = { 2, 4, 5, 6 };
        int m = b.length;

        int res = doUnion(a, n, b, m);
        System.out.println(res);

    }
}
