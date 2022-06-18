package _Sheet_1.String;

public class ImplementStrstr {
    public static void fillLPS(int[] lps, String pat) {
        int m = pat.length();
        lps[0] = 0;
        int i = 1, len = 0;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else
                    len = lps[len - 1];
            }
        }
    }

    public static int KMP(String text, String pat) {
        int n = text.length();
        int m = pat.length();

        if (m > n)
            return -1;

        int[] lps = new int[m];
        fillLPS(lps, pat);

        int i = 0, j = 0;

        while (i < n) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == m)
                return i - m;

            if (i < n && text.charAt(i) != pat.charAt(j)) {
                if (j == 0)
                    i++;
                else
                    j = lps[j - 1];
            }
        }

        return -1;

    }

    int strstr(String s, String x) {

        return KMP(s, x);

    }
}
