package _Sheet_1.Hashing;

import java.util.HashSet;

public class TwoSum {
    public boolean keypair(int[] A, int N, int X) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (set.contains(X - A[i]))
                return true;
            set.add(A[i]);
        }
        return false;
    }
}
