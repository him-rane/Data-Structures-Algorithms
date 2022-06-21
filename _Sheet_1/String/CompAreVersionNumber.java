package _Sheet_1.String;

public class CompAreVersionNumber {
    public static int VersionCompare(String v1, String v2) {
        // code here.
        int n = v1.length();
        int m = v2.length();

        int i = 0, j = 0;

        while (i < n && j < m) {
            int val1 = 0;
            while (i < n && v1.charAt(i) != '.') {
                val1 = (val1 * 10) + (v1.charAt(i) - 48);
                i++;
            }
            int val2 = 0;
            while (j < m && v2.charAt(j) != '.') {
                val2 = (val2 * 10) + (v2.charAt(j) - 48);
                j++;
            }
            i++;
            j++;

            if (val1 > val2)
                return 1;
            else if (val2 > val1)
                return -1;
        }
        int val1 = 0;
        while (i < n) {
            if (v1.charAt(i) == '.') {
                val1 = 0;
            } else {
                val1 = (val1 * 10) + (v1.charAt(i) - 48);
            }
            i++;
            if (val1 > 0)
                return 1;

        }
        int val2 = 0;
        while (j < m) {
            if (v2.charAt(j) == '.') {
                val2 = 0;
            } else {

                val2 = (val2 * 10) + (v2.charAt(j) - 48);
                // System.out.println(v2.charAt(j)+" "+val2);
            }
            j++;

            if (val2 > 0)
                return -1;

        }

        if (val1 > val2)
            return 1;
        else if (val2 > val1)
            return -1;

        return 0;
    }
}
