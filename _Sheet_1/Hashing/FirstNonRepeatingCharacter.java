package _Sheet_1.Hashing;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static String find(String S) {
        // code here.
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (int i = 0; i < S.length(); i++) {
            if (map.get(S.charAt(i)) == 1)
                return S.charAt(i) + "";
        }
        return -1 + "";
    }
}
