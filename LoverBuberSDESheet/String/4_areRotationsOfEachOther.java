package LoverBuberSDESheet.String;

class areRotationsOfEachOther {
    public static void fillLPS(int[] lps, String pat, int m) {
        lps[0] = 0;
        int j = 1, len = 0;
        while (j < m) {
            if (pat.charAt(len) == pat.charAt(j)) {
                len++;
                lps[j] = len;
                j++;
            } else {
                if (len == 0) {
                    lps[j] = 0;
                    j++;
                } else
                    len = lps[len - 1];
            }
        }
    }

    public static boolean KMP(String text, String pat) {
        int n = text.length();
        int m = pat.length();

        int[] lps = new int[m];
        fillLPS(lps, pat, m);

        int i = 0, j = 0;

        while (i < n) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == m)
                return true;
            if (i < n && text.charAt(i) != pat.charAt(j)) {
                if (j == 0)
                    i++;
                else
                    j = lps[j - 1];
            }
        }
        return false;
    }

    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        return KMP(s1 + s1, s2);

    }
}
