package LoverBuberSDESheet.String;

import java.util.ArrayList;

class Pair {
    char alphabet;
    int count;

    Pair(char ch, int x) {
        this.alphabet = ch;
        this.count = x;
    }
}

class DuplicateCharacters {
    public static ArrayList<Pair> duplicate_char(String s, int n) {
        ArrayList<Pair> list = new ArrayList<>();
        int[] map = new int[256];
        for (int i = 0; i < n; i++) {

            map[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {

            if (map[i] > 1) {
                list.add(new Pair((char) (i), map[i]));
            }
        }

        return list;
    }
}
