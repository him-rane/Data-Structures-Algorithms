package LoverBuberSDESheet.String;

import java.util.ArrayList;

class RabinKarpAlgorithm {
    public static boolean compare(String pat, String S, int i) {
        int j = 0;
        while (j < pat.length()) {
            if (i == S.length())
                return false;
            if (S.charAt(i) != pat.charAt(j))
                return false;
            i++;
            j++;

        }

        return true;
    }

    ArrayList<Integer> search(String pat, String S) {

        int n = S.length();
        int m = pat.length();
        int patHashCount = 0;
        for (int i = 0; i < m; i++) {
            patHashCount += pat.charAt(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        int sHashCount = 0;

        for (int i = 0; i < m; i++) {
            sHashCount += S.charAt(i);
        }

        int i;
        for (i = m; i < n; i++) {

            if (patHashCount == sHashCount) {
                if (compare(pat, S, i - m))
                    list.add(i - m + 1);

            }
            sHashCount -= S.charAt(i - m);
            sHashCount += S.charAt(i);
        }
        if (patHashCount == sHashCount) {

            if (compare(pat, S, i - m))
                list.add(i - m + 1);

        }

        if (list.size() == 0) {
            list.add(-1);
        }

        return list;

    }

    public static void main(String[] args) {

    }
}
