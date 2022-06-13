package _Sheet_1.Searching;

public class SquareRootOfNumber {
    long floorSqrt(long x) {
        // Your code here
        long res = 0;

        long left = 0;
        long right = x;
        while (left <= right) {

            long mid = left + (right - left) / 2;
            long sqr = mid * mid;

            if (sqr == x)
                return mid;
            else if (sqr < x) {
                res = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }

        return res;

    }
}
