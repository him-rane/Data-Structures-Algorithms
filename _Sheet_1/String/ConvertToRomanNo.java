package _Sheet_1.String;

public class ConvertToRomanNo {
    String convertToRoman(int n) {
        int[] number = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] code = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String s = "";
        for (int i = 0; i < code.length; i++) {
            while (n - number[i] >= 0) {
                n -= number[i];
                s += code[i];
            }
        }
        return s;
    }
}
