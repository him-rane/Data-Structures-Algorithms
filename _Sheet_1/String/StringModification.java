package _Sheet_1.String;

public class StringModification {
    public static String rearrangeString(String str) {
        // Your code here
        int[] map = new int[26];
        int n = str.length();
        int sum = n;
        for (int i = 0; i < n; i++) {
            map[str.charAt(i) - 97]++;
        }

        String res = "";
        while (sum > 0) {
            for (int i = 0; i < 26; i++) {
                if (map[i] > 0) {
                    // System.out.println("res" + res);
                    res = res + (char) (i + 97) + "";
                    map[i]--;
                    sum--;
                }
            }
        }
        // System.out.println("res" + res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(rearrangeString("aaabc"));
    }
}
