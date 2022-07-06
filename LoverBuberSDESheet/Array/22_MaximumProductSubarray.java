package LoverBuberSDESheet.Array;

class MaximumProductSubarray {
    public static long maxProduct(int[] arr, int n) {
        // code here
        long maxP = arr[0];
        long minP = arr[0];
        long res = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                long temp = maxP;
                maxP = minP;
                minP = temp;
            }
            maxP = Math.max(arr[i], arr[i] * maxP);
            minP = Math.min(arr[i], arr[i] * minP);

            res = Math.max(res, maxP);

        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 5, -6, -7, 9 };
        int n = arr.length;
        System.out.println(maxProduct(arr, n));
    }
}
