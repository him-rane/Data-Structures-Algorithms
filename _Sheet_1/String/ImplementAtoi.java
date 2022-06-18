package _Sheet_1.String;

public class ImplementAtoi {
    public static int atoi(String str) {
        int n = str.length();

        int i = 0;
        boolean isNag = false;
        boolean isDigit = false;
        int res = 0;
        while (i < n) {
            char ch = str.charAt(i);
            if (ch == ' ')
                i++;
            else if (ch == '-' || ch > 47 && ch < 58) {
                if (ch == '-') {
                    if (i > 0 && str.charAt(i - 1) == '-')
                        return -1;
                    if (isDigit)
                        return -1;
                    i++;
                    isNag = true;
                }
                while (i < n && (str.charAt(i) > 47 && str.charAt(i) < 58)) {
                    isDigit = true;
                    int temp = str.charAt(i);
                    res = (res * 10) + (temp - 48);
                    i++;
                }
                if (i == n || str.charAt(i) == ' ') {
                    if (isNag)
                        return -res;
                    else
                        return res;
                }
            } else
                return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(atoi("  - 1234  786567"));
    }
}
