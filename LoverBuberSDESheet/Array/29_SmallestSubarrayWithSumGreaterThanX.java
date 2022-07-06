package LoverBuberSDESheet.Array;

class SmallestSubarrayWithSumGreaterThanX {
    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here
        int i = 0, j = 0;
        int min = n;

        int sum = 0;
        while (i <= j && j < n) {

            while (sum <= x && j < n) {
                sum += a[j];
                j++;
            }
            while (sum > x && i < j) {
                min = Math.min(min, j - i);
                sum -= a[i];
                i++;
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 2, 5, 6, 2, 8, 7, 6, 5 };
        int n = a.length;
        int x = 16;
        int res = smallestSubWithSum(a, n, x);

        System.out.println(res);
    }
}
