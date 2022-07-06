package LoverBuberSDESheet.String;

class PrintAllTheDuplicatesInTheInputString {

    public static void printDuplicates(String s) {
        int n = s.length();
        int[] map = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map[ch - 97] > 1) {
                System.out.println(ch + " ");
                map[ch - 97] = -1;
            }
            if (map[ch - 97] >= 0) {
                map[ch - 97]++;
            }

        }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicates(s);
    }

}