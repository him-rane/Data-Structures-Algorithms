package LoverBuberSDESheet.Array;

import java.util.HashSet;

class SubarrayWithZeroSum {
    static boolean findsum(int arr[], int n) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        int preSum = 0;
        for (int i : arr) {
            preSum += i;
            if (preSum == 0)
                return true;
            if (set.contains(preSum))
                return true;
            set.add(preSum);

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -3, -4, 2, 3, 1, 5, 3, -5, -6 };
        int n = arr.length;
        System.out.println(findsum(arr, n));
    }
}
