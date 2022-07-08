package LoverBuberSDESheet.String;

class isShuffledSubstring {
    public static boolean compare(int[] map1, int[] map2) {
        for (int i = 0; i < 256; i++) {
            if (map1[i] != map2[i])
                return false;
        }
        return true;
    }

    public static boolean isShuffledSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        if (n > m)
            return false;

        int[] map1 = new int[256];
        for (int i = 0; i < n; i++) {
            map1[str1.charAt(i)]++;
        }

        int[] map2 = new int[256];
        for (int i = 0; i < n; i++) {
            map2[str2.charAt(i)]++;
        }

        if (compare(map1, map2))
            return true;

        for (int i = n; i < m; i++) {
            map2[str2.charAt(i - n)]--;
            map2[str2.charAt(i)]++;
            if (compare(map1, map2))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "onetwofour";
        String str2 = "hellofourtwooneworld";

        System.out.println(isShuffledSubstring(str1, str2));
    }
}
