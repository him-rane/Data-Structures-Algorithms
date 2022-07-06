package LoverBuberSDESheet.Array;

class MinimumSwapsAndKTogether {
    public static int minSwap(int arr[], int n, int k) {
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k)
                count1++;
        }
        int count2 = 0;
        for (int i = 0; i < count1; i++) {
            if (arr[i] <= k)
                count2++;
        }
        if (count1 == count2)
            return 0;
        int min = count1 - count2;
        for (int i = count1; i < n; i++) {
            if (arr[i - count1] <= k)
                count2--;
            if (arr[i] <= k)
                count2++;
            min = Math.min(min, count1 - count2);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 8, 7, 2, 9, 5, 6, 3, 2, 4, 1, 6, 7 };
        int n = arr.length;
        int k = 4;
        int res = minSwap(arr, n, k);
        System.out.println(res);
    }
}
