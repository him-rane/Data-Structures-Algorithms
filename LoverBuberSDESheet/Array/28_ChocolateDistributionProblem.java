package LoverBuberSDESheet.Array;

import java.util.ArrayList;
import java.util.Collections;

class ChocolateDistributionProblem {
    public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        Collections.sort(a);
        long min = Integer.MAX_VALUE;
        for (int i = m - 1; i < n; i++) {
            min = Math.min(min, a.get(i) - a.get(i - (m - 1)));
        }

        return min;

    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(23);
        a.add(13);
        a.add(16);
        a.add(4);
        a.add(29);
        a.add(35);
        a.add(6);
        a.add(18);
        int n = a.size();
        int m = 4;
        long res = findMinDiff(a, n, m);
        System.out.println(res);
    }
}
