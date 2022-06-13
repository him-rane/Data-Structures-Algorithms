package _Sheet_1.Arrays;

public class Replace0With5 {
    public static int convertfive(int num) {
        int res = 0;
        while (num > 0) {
            int val = num % 10;
            if (val == 0)
                val = 5;
            res = (res * 10) + val;
            num = num / 10;
        }
        num = res;
        res = 0;
        while (num > 0) {
            int val = num % 10;
            res = (res * 10) + val;
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 34002;
        int res = convertfive(num);
        System.out.println(res);
    }
}
