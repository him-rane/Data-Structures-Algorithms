package _Sheet_1.Arrays;

public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) {
        // code here
        long pro = 1;

        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                zero++;
            else
                pro = pro * nums[i];
        }

        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            if (zero == 1) {
                if (nums[i] == 0)
                    ans[i] = pro;
                else
                    ans[i] = 0;
            } else if (zero > 1) {
                ans[i] = 0;
            } else {
                ans[i] = pro / nums[i];
            }
        }
        return ans;
    }
}
