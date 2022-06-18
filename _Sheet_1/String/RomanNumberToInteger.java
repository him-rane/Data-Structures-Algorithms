package _Sheet_1.String;

import java.util.HashMap;

public class RomanNumberToInteger {
    public int romanToDecimal(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = str.length();
        int num = map.get(str.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            int prevInt = map.get(str.charAt(i + 1));
            int currInt = map.get(str.charAt(i));
            if (prevInt > currInt) {
                num -= currInt;
            } else
                num += currInt;
        }
        return num;
    }
}
