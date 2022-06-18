package _Sheet_1.Hashing;

import java.util.HashMap;

public class SubarraysWithEqualOneAndZero {
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // add your code here
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                arr[i] = -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int preSum = 0;
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            if (preSum == 0)
                res++;

            if (map.containsKey(preSum))
                res += map.get(preSum);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
