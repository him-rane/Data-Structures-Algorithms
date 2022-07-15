package LoverBuberSDESheet.String;

class MinNumberOfFlips {
    public static int sol(String S, char ch) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                if (S.charAt(i) != ch)
                    c1++;
            } else {
                if (S.charAt(i) == ch)
                    c2++;
            }
        }

        return c1 + c2;
    }

    public static int minFlips(String S) {

        int res1 = sol(S, '1');
        int res2 = sol(S, '0');

        return Math.min(res1, res2);

    }

    public static void main(String[] args) {
        String S = "101001110";
        int res = minFlips(S);
        System.out.println(res);

    }
}
