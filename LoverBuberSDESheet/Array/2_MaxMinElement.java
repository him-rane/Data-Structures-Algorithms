package LoverBuberSDESheet.Array;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

class MaxMinElement {

    static pair getMinMax(long a[], long n) {

        long min = a[0], max = a[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        return new pair(min, max);
    }

    public static void main(String[] args) {
        long[] a = { 2, 3, 4, 1, 9, 4, 3 };
        int n = a.length;
        pair p = getMinMax(a, n);
        System.out.println(p.first + " " + p.second);
    }
}
