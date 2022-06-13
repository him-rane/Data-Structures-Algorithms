package _Sheet_1.Arrays;

import java.util.ArrayList;

public class FindDuplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (count[i] > 1) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
            return list;
        }
        return list;
    }
}
