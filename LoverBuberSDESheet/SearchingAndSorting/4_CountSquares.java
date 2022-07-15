package LoverBuberSDESheet.SearchingAndSorting;

class CountSquares {
    static int countSquares(int N) {

        long start = 1, end = N, ans = 0;
        while (start <= end) {
            long mid = (start + end) / 2;

            if (mid * mid < N) {
                start = mid + 1;
                ans = mid;
            } else
                end = mid - 1;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int N = 345423;
        System.out.println(countSquares(N));
    }
}
