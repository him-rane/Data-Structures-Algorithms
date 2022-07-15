package LoverBuberSDESheet.Array;

class CountTheReversals {
    public static int countRev(String s) {
        // your code here
        int r = 0, l = 0;
        int n = s.length();
        if (n % 2 != 0) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '{') {
                l++;
            }
            if (s.charAt(i) == '}') {
                if (l == 0)
                    r++;
                else
                    l--;
            }
        }
        int ans = (int) (Math.ceil((0.0 + l) / 2)
                + Math.ceil((0.0 + r) / 2));
        return ans;
    }

    public static void main(String[] args) {
        String s = "{{{{}{}{}}{}}}}}}}}}{{{{";
        int res = countRev(s);
        System.out.println(res);
    }
}
