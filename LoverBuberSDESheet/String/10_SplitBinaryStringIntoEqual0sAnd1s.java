package LoverBuberSDESheet.String;

class SplitTheBinaryStringIntoSubstringsWithEqualNumberOf0sAnd1s {
    public static int countSubstring(String s) {
        int countOne = 0, countZero = 0;
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                countZero++;
            }
            if (s.charAt(i) == '1') {
                countOne++;
            }
            if (countOne == countZero)
                count++;
        }

        if (countOne != countZero)
            return -1;
        return count;
    }

    public static void main(String[] args) {
        String s = "0100110101";
        int res = countSubstring(s);
        System.out.println(res);

    }
}
