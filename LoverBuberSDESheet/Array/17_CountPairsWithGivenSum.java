package LoverBuberSDESheet.Array;

import java.util.HashMap;

class CountPairsWithGivenSum {
    public static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i]))
                count += map.get(k - arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 6, 2, 8, 2, 1, 3, 5, 3, 7, 3, 8, 1, 9 };
        int k = 8;
        int n = arr.length;
        int res = getPairsCount(arr, n, k);
        System.out.println(res);
    }
}
