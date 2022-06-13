package _Sheet_1.Arrays;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : a) {
            set.add(val);
        }
        int count = 0;
        for (int val : b) {
            if (set.contains(val)) {
                count++;
                set.remove(val);
            }
        }
        return count;
    }
}