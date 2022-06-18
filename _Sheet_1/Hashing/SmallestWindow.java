package _Sheet_1.Hashing;

public class SmallestWindow {
    public static boolean compare(int[] map, int[] tMap) {
        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) {
                if (map[i] > tMap[i])
                    return false;
            }
        }
        return true;
    }

    public static String smallestWindow(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean flag = false;

        int[] map = new int[26];
        for (int i = 0; i < m; i++) {
            map[p.charAt(i) - 97]++;
        }

        int[] tMap = new int[26];
        int i = 0, j = 0;

        int start = 0;
        int end = n;
        while (i < n) {
            if (compare(map, tMap)) {
                flag = true;
                if ((end - start) > (i - j)) {
                    end = i;
                    start = j;
                }
                tMap[s.charAt(j) - 97]--;
                j++;

            } else {
                tMap[s.charAt(i) - 97]++;
                i++;
            }
        }
        while (j < n) {
            if (compare(map, tMap)) {
                flag = true;
                if ((end - start) > (i - j)) {
                    end = i;
                    start = j;
                }
            }
            tMap[s.charAt(j) - 97]--;
            j++;
        }
        if (flag)
            return s.substring(start, end);
        else
            return -1 + "";

    }

    public static void main(String[] args) {

        String s = "zoomlazapzo";
        String p = "oom";
        String res = smallestWindow(s, p);
        System.out.println(res);
    }
}
