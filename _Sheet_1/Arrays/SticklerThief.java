package _Sheet_1.Arrays;

public class SticklerThief {
    public int FindMaxSum(int arr[], int n) {
        // Your code here
        if (n == 1)
            return arr[0];
        if (n == 2)
            return Math.max(arr[1], arr[0]);
        arr[2] = arr[2] + arr[0];
        if (n == 3)
            return arr[2];
        for (int i = 3; i < n; i++) {
            arr[i] = Math.max(arr[i - 2], arr[i - 3]) + arr[i];
        }

        return Math.max(arr[n - 2], arr[n - 1]);
    }
}
