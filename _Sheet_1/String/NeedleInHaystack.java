package _Sheet_1.String;

public class NeedleInHaystack {
    public static void fillLPS(String pat, int[] lps) {
        int m = pat.length();
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

    public static int KMP(String text, String pat) {
        if (pat == null || pat.length() == 0)
            return 0;
        int n = text.length();
        int m = pat.length();

        if (m > n)
            return -1;

        int[] lps = new int[m];
        fillLPS(pat, lps);

        int i = 0, j = 0;

        while (i < n) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == m)
                return i - m;
            if (i < n && text.charAt(i) != pat.charAt(j)) {
                if (j == 0) {
                    i++;
                } else
                    j = lps[j - 1];
            }
        }

        return -1;

    }

    public static int NeedleinHaystack(String haystack, String needle) {
        return KMP(haystack, needle);
    }
}
