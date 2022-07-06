package LoverBuberSDESheet.Array;

class TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        int leftMax = arr[0], rightMax = arr[n - 1];
        int left = 1, right = n - 1;
        long sum = 0;
        while (left <= right) {
            if (leftMax < rightMax) {
                if (leftMax < arr[left])
                    leftMax = arr[left];
                else
                    sum += leftMax - arr[left];
                left++;
            } else {
                if (rightMax < arr[right])
                    rightMax = arr[right];
                else
                    sum += rightMax - arr[right];
                right--;
            }
        }
        return sum;
    }
}
