package _Sheet_1.DP;

public class CountNumberOfHops {
    static long countWays(int n) {
        // add your code here
        long one = 1, two = 2, three = 4;
        if (n == 1 || n == 2)
            return n;
        if (n == 3)
            return n + 1;

        long res = 0;
        while (n > 3) {
            res = (one + two + three) % (1000000000 + 7);
            one = two;
            two = three;
            three = res;
            n--;
        }
        return res % (1000000000 + 7);

    }
}
