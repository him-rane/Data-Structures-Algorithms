package DP;

public class MaximumSumNonAdjacentElements {
    public static int maximumSumNonAdjacentElements(int[] arr) {
        int n = arr.length;

        int prevEx = 0;
        int prevEn = arr[0];
        int currEx = 0;
        int currEn = 0;

        for (int i = 1; i < n; i++) {
            currEn = prevEx + arr[i];
            currEx = Math.max(prevEx, prevEn);

            prevEn = currEn;
            prevEx = currEx;
        }

        return (Math.max(prevEx, prevEn));
    }

    public static void main(String[] args) {
        int[] arr = { 2, -4, 1, 0, -6 };
        int res = maximumSumNonAdjacentElements(arr);
        System.out.println(res);
    }
}
