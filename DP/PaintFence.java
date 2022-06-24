package DP;

public class PaintFence {
    public static int sol(int n, int k) {
        if (n == 1)
            return k;
        int a1 = k;
        int b1 = k * (k - 1);
        int a2 = 0, b2 = 0;
        for (int i = 2; i < n; i++) {
            a2 = b1;
            b2 = (a1 + b1) * (k - 1);
            a1 = a2;
            b1 = b2;
        }
        return (a1 + b1);
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 5;
        int res = sol(n, k);
        System.out.println(res);
    }
}
