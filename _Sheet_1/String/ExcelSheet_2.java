package _Sheet_1.String;

public class ExcelSheet_2 {
    public int excelColumnNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = (res * 26) + (int) s.charAt(i) - 64;
        }

        return res;
    }
}
