package _Sheet_1.Hashing;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {
    int maxLen(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            if (preSum == 0)
                res = i + 1;
            if (map.containsKey(preSum))
                res = Math.max(res, i - map.get(preSum));
            else
                map.put(preSum, i);
        }

        return res;
    }
}
