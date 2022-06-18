package _Sheet_1.Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class PositiveNegativePair {
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        // code here.
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(-arr[i])) {
                int temp = Math.abs(arr[i]);
                list.add(-temp);
                list.add(temp);
                set.remove(arr[i]);
            }

            set.add(arr[i]);
        }
        return list;
    }
}
