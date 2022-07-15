package LoverBuberSDESheet.String;

import java.util.ArrayList;
import java.util.Collections;

class SubsequencesOfString {
    public static ArrayList<String> sol(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String restOfStr = str.substring(1);
        ArrayList<String> list = subsequences(restOfStr);

        ArrayList<String> ans = new ArrayList<>();
        for (String s : list) {

            ans.add(ch + s);
            ans.add(s + "");
        }

        return ans;
    }

    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> ans = sol(str);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(subsequences("ph"));
    }
}
