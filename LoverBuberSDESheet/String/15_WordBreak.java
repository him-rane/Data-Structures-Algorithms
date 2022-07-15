package LoverBuberSDESheet.String;

import java.util.HashSet;
import java.util.Set;

class WordBreak {
    public static boolean wordBreak(String s, Set<String> dict) {

        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];
    }

    public static int wordBreak(String A, String[] B) {
        // code here
        HashSet<String> set = new HashSet<>();
        for (String s : B) {
            set.add(s);
        }

        boolean flag = wordBreak(A, set);
        if (flag)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        int n = 12;
        String[] B = { "i", "like", "sam",
                "sung", "samsung", "mobile",
                "ice", "cream", "icecream",
                "man", "go", "mango" };
        String A = "ilike";
        int res = wordBreak(A, B);
        System.out.println(res);
    }
}
