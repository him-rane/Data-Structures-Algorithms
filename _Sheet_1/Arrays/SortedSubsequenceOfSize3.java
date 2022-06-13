package _Sheet_1.Arrays;

import java.util.ArrayList;

public class SortedSubsequenceOfSize3 {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here
        int[] minLeft = new int[n];
        minLeft[0] = -1;
        int min = 0;
        for (int i = 1; i < n; i++) {
            if (arr.get(i) <= arr.get(min)) {
                min = i;
                minLeft[i] = -1;
            } else
                minLeft[i] = min;
        }

        int[] maxRight = new int[n];
        maxRight[n - 1] = -1;
        int max = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) >= arr.get(max)) {
                max = i;
                maxRight[i] = -1;
            } else
                maxRight[i] = max;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (maxRight[i] != -1 && minLeft[i] != -1) {
                list.add(arr.get(minLeft[i]));
                list.add(arr.get(i));
                list.add(arr.get(maxRight[i]));
                break;
            }
        }
        // System.out.println(list);

        return list;
    }
}
