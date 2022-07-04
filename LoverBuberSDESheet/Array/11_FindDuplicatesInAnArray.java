package LoverBuberSDESheet.Array;

import java.util.ArrayList;

class FindDuplicatesInAnArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int[] map = new int[n];
        for (int i = 0; i < n; i++) {
            map[arr[i]]++;

        }
        for (int i = 0; i < n; i++) {
            if (map[i] > 1)
                list.add(i);
        }

        if (list.size() == 0) {
            list.add(-1);
            return list;
        }
        return list;
    }
}
