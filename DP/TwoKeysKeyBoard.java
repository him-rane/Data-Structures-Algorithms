package DP;

public class TwoKeysKeyBoard {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public int minSteps(int n) {
        if (n == 0)
            return 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0 && isPrime(i)) {
                    sum += i;
                    n /= i;
                }

            }
        }
        return sum;
    }
}
