package _Sheet_1.String;

public class MultiplyTwoStrings {
    public String multiplyStrings(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int[] res = new int[n1 + n2];
        int k = res.length - 1;

        int start1 = 0, start2 = 0;
        int sign = 1;
        if (s1.charAt(0) == '-') {
            start1 = 1;
            sign *= -1;
        }
        if (s2.charAt(0) == '-') {
            start2 = 1;
            sign *= -1;
        }

        for (int i = n1 - 1; i >= start1; i--) {
            int ch1 = s1.charAt(i) - 48;
            int idx = k;
            int carry = 0, val = 0;
            for (int j = n2 - 1; j >= start2; j--) {
                int ch2 = s2.charAt(j) - 48;

                int mult = (ch1 * ch2) + carry;
                val = mult % 10;
                carry = mult / 10;

                int sum = res[idx] + val;

                val = sum % 10;
                carry += sum / 10;
                res[idx] = val;
                idx--;
            }
            if (carry > 0)
                res[idx] = carry;
            k--;
        }

        String multply = "";
        int i = 0;
        while (i < n1 + n2 && res[i] == 0) {
            i++;
        }
        if (i == (n1 + n2))
            return "0";
        for (; i < n1 + n2; i++) {
            multply = multply + "" + res[i];
        }

        if (sign == -1)
            return "-" + multply;
        else
            return multply;

    }
}
