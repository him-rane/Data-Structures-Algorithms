package LoverBuberSDESheet.Array;

import java.util.HashSet;

class LongestConsecutiveSubsequence {
    static int findLongestConseqSubseq(int arr[], int n) {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i] - 1) == false) {
                int count = 0;
                while (set.contains(arr[i] + count)) {
                    count++;
                }

                max = Math.max(count, max);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3, 6, 3, 7 };
        int n = arr.length;
        System.out.println(findLongestConseqSubseq(arr, n));
    }
}
