package LoverBuberSDESheet.Matrix;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public static ArrayList<Integer> findCommonElements(ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int n = mat.size();
        int m = mat.get(0).size();

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        if (n == 1) {
            for (int j = 0; j < m; j++) {
                list.add(mat.get(0).get(j));
            }

            return list;
        }

        for (int j = 0; j < m; j++) {
            map.put(mat.get(0).get(j), 1);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = mat.get(i).get(j);
                if (map.containsKey(val)) {
                    map.put(val, map.get(val) + 1);

                    if (map.get(val) > i + 1)
                        map.put(val, map.get(val) - 1);
                    else if (map.get(val) == n)
                        list.add(val);
                }

            }
        }

        return list;

    }
}
