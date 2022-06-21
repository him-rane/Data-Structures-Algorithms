package _Sheet_1.String;

public class ExcelSheet {
    public String excelColumn(int n) {
        String res = "";
        while (n > 0) {
            int rem = n % 26;
            if (rem == 0) {
                res = 'Z' + res;
                n = (n / 26) - 1;
            } else {
                res = ((char) (rem + 64)) + res;
                n /= 26;
            }
        }
        return res;
    }
}
