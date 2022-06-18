package _Sheet_1.String;

public class RotatedTwoPlaces {
    public static boolean isRotated(String str1, String str2) {

        int n = str1.length();
        if (str1.charAt(0) == str2.charAt(n - 2) && str1.charAt(1) == str2.charAt(n - 1)) {
            int i;
            for (i = 2; i < n; i++) {
                if (str2.charAt(i - 2) != str1.charAt(i))
                    break;
            }
            if (i == n)
                return true;
        }
        if (str2.charAt(0) == str1.charAt(n - 2) && str2.charAt(1) == str1.charAt(n - 1)) {
            int i;
            for (i = 2; i < n; i++) {
                if (str1.charAt(i - 2) != str2.charAt(i))
                    break;
            }
            if (i == n)
                return true;
        }
        return false;
    }
}
