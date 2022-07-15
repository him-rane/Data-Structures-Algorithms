package LoverBuberSDESheet.String;

import java.util.HashMap;

class RomanNumberToInteger {
    public static int romanToDecimal(String str) {
        // code here
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
            int prev = map.get(str.charAt(i + 1));
            int curr = map.get(str.charAt(i));

            if (curr < prev)
                num -= curr;
            else
                num += curr;

        }
        return num;
    }

    public static void main(String[] args) {
        String str = "MCMIV";
        int res = romanToDecimal(str);
        System.out.println(res);
    }
}
