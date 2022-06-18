package _Sheet_1.Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsIneveryWindow {
    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(map.size());

        for (int i = k; i < n; i++) {

            map.put(A[i], map.getOrDefault(A[i], 0) + 1);

            map.put(A[i - k], map.get(A[i - k]) - 1);

            if (map.get(A[i - k]) <= 0)
                map.remove(A[i - k]);

            list.add(map.size());
        }

        return list;
    }
}
