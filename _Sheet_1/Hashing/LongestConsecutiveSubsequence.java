package _Sheet_1.Hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    static int findLongestConseqSubseq(int arr[], int N) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(arr[i]);
        }
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (!set.contains(arr[i] - 1)) {
                int count = 1;
                while (set.contains(arr[i] + count))
                    count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
