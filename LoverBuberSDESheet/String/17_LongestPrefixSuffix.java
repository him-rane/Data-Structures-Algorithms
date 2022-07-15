package LoverBuberSDESheet.String;

class LongestPrefixSuffix {
    int lps(String s) {
        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;
        int len = 0, i = 1;

        int max = 0;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }
        return lps[n - 1];
    }
}
