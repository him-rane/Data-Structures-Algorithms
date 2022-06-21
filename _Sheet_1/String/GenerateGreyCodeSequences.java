package _Sheet_1.String;

import java.util.ArrayList;

public class GenerateGreyCodeSequences {
    public static ArrayList<String> generateCode(int n) {

        if (n == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");

            return base;
        }

        ArrayList<String> list = generateCode(n - 1);
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            res.add(0 + list.get(i) + "");
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(1 + list.get(i) + "");
        }

        return res;
    }
}
