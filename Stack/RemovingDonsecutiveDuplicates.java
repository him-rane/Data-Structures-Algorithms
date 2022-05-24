package Stack;

import java.util.Stack;

public class RemovingDonsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        // Your code here
        String s = "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.isEmpty())
                s = s + str.charAt(i);
            else if (!st.isEmpty() && st.peek() != str.charAt(i))
                s = s + str.charAt(i);
            st.push(str.charAt(i));
        }
        return s;
    }

    public static void main(String[] args) {
        String str = "aaabbbssaaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
