package _Sheet_1.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SortAnArrayAccordingToTheOther {
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[N];

        for (int i = 0; i < N; i++) {
            map.put(A1[i], map.getOrDefault(A1[i], 0) + 1);
        }
        int idx = 0;
        for (int i = 0; i < M; i++) {
            if (map.containsKey(A2[i])) {
                int temp = map.get(A2[i]);
                while (temp > 0) {
                    res[idx] = A2[i];
                    idx++;
                    temp--;
                    map.remove(A2[i]);
                }
            }
        }
        int pivot = idx;

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            it.remove();

            int temp = (int) pair.getValue();
            while (temp > 0) {
                res[idx] = (int) pair.getKey();
                idx++;
                temp--;
                map.remove((int) pair.getKey());
            }
        }

        Arrays.sort(res, pivot, N);
        return res;
    }
}
