package _Sheet_1.String;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    int SubsequenceLength(String s) {
        // Code here
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int start = 0, res = 0;
        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }
            res = Math.max(res, end - start + 1);
            map.put(ch, end);
        }
        return res;
    }
}
