package LoverBuberSDESheet.Array;

import java.util.HashMap;

class ArraySubsetOfanotherArray {
    public static String isSubset(long a1[], long a2[], long n, long m) {
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], (long) 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            if (map.containsKey(a2[i]) == false)
                return "No";
            else {
                map.put(a2[i], map.get(a2[i]) - 1);
                if (map.get(a2[i]) == 0)
                    map.remove(a2[i]);
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        long[] a1 = { 2, 5, 3, 8, 2, 9, 7, 5 };
        int n = a1.length;
        long[] a2 = { 3, 2, 7 };
        int m = a2.length;
        System.out.println(isSubset(a1, a2, n, m));
    }
}