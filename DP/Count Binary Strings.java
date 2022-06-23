package DP;

class CountBinaryStrings {
    public static int countBinaryStrings(int n) {
        int prevOne = 1;
        int prevZero = 1;
        int currOne = 0;
        int currZero = 0;
        for (int i = 1; i < n; i++) {
            currOne = prevOne + prevZero;
            currZero = prevOne;

            prevOne = currOne;
            prevZero = currZero;
        }

        return (prevOne + prevZero);
    }

    public static void main(String[] args) {
        int n = 100;
        int res = countBinaryStrings(n);
        System.out.println(res);
    }
}
