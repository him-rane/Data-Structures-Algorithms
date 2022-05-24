package Stack;

import java.util.Stack;

public class RemovingConsecutiveDuplicates_2 {
    public static String removePair(String str) {
        // your code here
        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else
                st.push(ch);
        }
        String res = "";
        while (!st.isEmpty()) {
            res = st.peek() + res;
            st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "aabbabccba";
        System.out.println(removePair(str));
    }
}
