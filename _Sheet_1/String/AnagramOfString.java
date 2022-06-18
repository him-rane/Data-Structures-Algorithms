package _Sheet_1.String;

public class AnagramOfString {
    public int remAnagrams(String s, String s1) {
        int n = s.length();
        int m = s1.length();

        int[] m1 = new int[26];
        int[] m2 = new int[26];

        for (int i = 0; i < n; i++) {
            m1[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < m; i++) {
            m2[s1.charAt(i) - 97]++;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(m1[i] - m2[i]);

        }
        return count;

    }
}
