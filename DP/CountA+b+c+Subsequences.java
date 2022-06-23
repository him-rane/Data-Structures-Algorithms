package DP;

class CountSubsequences {
    public static int countSubsequences(String s) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch == 'a') {
                a = (2 * a) + 1;
            } else if (ch == 'b') {
                b = (2 * b) + a;
            } else {
                c = (2 * c) + b;
            }
        }

        return (c);
    }

    public static void main(String[] args) {

    }
}
