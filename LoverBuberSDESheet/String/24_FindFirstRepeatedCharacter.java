package LoverBuberSDESheet.String;

class FindFirstRepeatedCharacter {
    public static String firstRepChar(String s) {
        // code here
        int[] map = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map[ch] > 0)
                return ch + "";
            map[ch]++;
        }
        return "-1";
    }

    public static void main(String[] args) {
        String s = "himanshurane";
        System.out.println(firstRepChar(s));

    }
}
