package _Sheet_1.String;

public class ReverseWordsGivenString {
    String reverseWords(String S) {
        // code here
        int start = 0;
        String ans = "";

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                ans = "." + (S.substring(start, i)) + ans;
                start = i + 1;
            }
        }

        ans = (S.substring(start)) + ans;
        return ans;
    }
}
