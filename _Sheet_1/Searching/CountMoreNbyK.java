package _Sheet_1.Searching;

import java.util.HashMap;

public class CountMoreNbyK {
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr[i])) {
                if (map.get(arr[i]) != -1)
                    map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > n / k) {
                count++;
                map.put(arr[i], -1);
            }
        }

        return count;
    }
}
