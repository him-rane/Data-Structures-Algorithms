package _Sheet_1.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

class RemoveDuplicatesInSmallPrimeArray {
    public static ArrayList<Integer> removeDuplicate(int arr[], int n) {
        long product = 1;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                list.add(arr[i]);
                set.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9 };
        int n = arr.length;
        System.out.println(removeDuplicate(arr, n));
    }
}