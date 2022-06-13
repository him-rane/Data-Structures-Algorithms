package Array;

public class MaximumAndMinimum {
    static class MinMaxPair {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    public static MinMaxPair maximumAndMinimum(int[] arr) {
        MinMaxPair pair = new MinMaxPair();
        for (int i = 0; i < arr.length; i++) {
            pair.max = Math.max(pair.max, arr[i]);
            pair.min = Math.min(pair.min, arr[i]);
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -3, -5 };
        MinMaxPair pair = maximumAndMinimum(arr);
        System.out.println(pair.max + " " + pair.min);
    }
}
