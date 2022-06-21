package _Sheet_1.String;

import java.util.ArrayList;

public class StringPermutations {
    public static void sol(int n, String que, String ans, ArrayList<String> list) {
        if (que.length() == 0) {
            list.add(ans);
            return;
        }
        for (int i = 0; i < que.length(); i++) {
            char ch = que.charAt(i);
            String resStr = que.substring(0, i) + que.substring(i + 1, que.length());
            sol(n, resStr, ans + "" + ch, list);
        }
    }

    public ArrayList<String> permutation(String S) {
        // Your code here
        int n = S.length();
        int[] map = new int[256];
        for (int i = 0; i < n; i++) {
            map[S.charAt(i)]++;
        }

        S = "";
        for (int i = 0; i < 256; i++) {
            int t = map[i];
            while (t > 0) {
                S += (char) i;
                t--;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        sol(S.length(), S, "", list);

        return list;
    }
}
