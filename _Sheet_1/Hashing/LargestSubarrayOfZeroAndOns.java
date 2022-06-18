package _Sheet_1.Hashing;

import java.util.HashMap;

public class LargestSubarrayOfZeroAndOns {
    int maxLen(int[] arr, int N) {
        // Your code here
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0)
                arr[i] = -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int preSum = 0;
        for (int i = 0; i < N; i++) {
            preSum += arr[i];
            if (preSum == 0)
                res = i + 1;
            if (map.containsKey(preSum))
                res = Math.max(res, i - map.get(preSum));
            if (!map.containsKey(preSum))
                map.put(preSum, i);
        }

        return res;
    }
}
