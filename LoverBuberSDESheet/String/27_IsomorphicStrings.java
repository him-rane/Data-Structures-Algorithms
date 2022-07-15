package LoverBuberSDESheet.String;

import java.util.HashMap;

class IsomorphicStrings {
    public static boolean areIsomorphic(String str1, String str2) {
        // Your code here
        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                if (map.get(str1.charAt(i)) != str2.charAt(i))
                    return false;
            } else
                map.put(str1.charAt(i), str2.charAt(i));
        }
        map = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                if (map.get(str2.charAt(i)) != str1.charAt(i))
                    return false;
            } else
                map.put(str2.charAt(i), str1.charAt(i));
        }

        return true;

    }

    public static void main(String[] args) {
        String str1 = "aay";
        String str2 = "zzp";

        System.out.println(areIsomorphic(str1, str2));

    }
}
