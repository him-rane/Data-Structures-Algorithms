package _Sheet_1.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// class to define user defined conparator

public class TopKFrequentElementsInArray {
    public static int[] topK(int[] nums, int k) {
        // Code here
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        /// System.out.println(map);

        int idx = 0;
        int[][] freq = new int[map.size()][2];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            freq[idx][0] = entry.getKey();
            freq[idx][1] = entry.getValue();
            idx++;
        }

        Arrays.sort(freq, (i1, i2) -> Integer.compare(i2[1], i1[1]));

        // for (int i = 0; i < freq.length; i++) {

        // System.out.println(freq[i][0] + " " + freq[i][1]);

        // }

        int[] ans = new int[k];
        idx = 0;

        for (int i = 1; i < n; i++) {
            int temp = freq[i][0];
            while (freq[i][1] == freq[i - 1][1]) {
                temp = Math.max(freq[i][0], temp);
                i++;
            }

            // if(idx>0 && freq[])
            ans[idx] = temp;
            idx++;
            if (idx == k)
                break;
        }
        for (int val : ans) {
            System.out.println(val);
        }
        return ans;

    }

    public static void main(String[] args) {
        // N = 8

        int[] nums = { 1, 1, 2, 2, 3, 3, 3, 4 };
        int k = 2;
        int n = nums.length;
        topK(nums, k);

    }
}
