package LoverBuberSDESheet.Array;

class MinimumNumberOfJumps {
    static int minJumps(int[] arr) {
        // your code here
        int n = arr.length;
        if (n == 1)
            return 0;
        if (arr[0] == 0)
            return -1;

        int maxR = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps;
            maxR = Math.max(maxR, i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxR)
                    return -1;
                steps = maxR - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 8, 4, 2, 4, 6, 1, 2, 1, 4, 2, 5, 0, 2, 1, 4, 5, 0, 5 };
        int res = minJumps(arr);
        System.out.println(res);
    }

}
