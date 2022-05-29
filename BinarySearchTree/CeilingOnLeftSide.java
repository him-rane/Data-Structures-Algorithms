package BinarySearchTree;

import java.util.TreeSet;

public class CeilingOnLeftSide {
    public static void printCeiling(int[] arr) {
        int n = arr.length;
        System.out.println(-1 + " ");
        TreeSet<Integer> set = new TreeSet<>();
        set.add(arr[0]);
        for (int i = 0; i < n; i++) {
            if (set.ceiling(arr[i]) == null)
                System.out.println(-1 + " ");
            else
                System.out.println(set.ceiling(arr[i]) + " ");

            set.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 2, 8, 2, 0, 4, 3, 2, 5, 6, 7, 8, 4 };
        printCeiling(arr);
    }
}
