package Stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPrefix {
    public static void infixToPrefix(String s) {
        HashMap<Character, Integer> precedence = new HashMap<>();

        precedence.put('-', 1);
        precedence.put('+', 2);
        precedence.put('*', 3);
        precedence.put('/', 4);
        precedence.put('^', 5);

        Stack<Character> st = new Stack<>();
        int n = s.length();

        String prefix = "";

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ')')
                st.push(ch);
            else if (ch == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    prefix = st.peek() + prefix;
                    st.pop();
                }
                st.pop();
            } else if (precedence.containsKey(ch) == false)
                prefix = ch + prefix;
            else {
                if (st.isEmpty())
                    st.push(ch);
                else {
                    while (!st.isEmpty() && precedence.containsKey(st.peek())
                            && precedence.get(ch) < precedence.get(st.peek())) {
                        prefix = st.peek() + prefix;
                        st.pop();
                    }
                    st.push(ch);
                }
            }

        }
        while (!st.isEmpty()) {
            prefix = st.peek() + prefix;
            st.pop();
        }
        System.out.println(prefix);

    }

    public static void main(String[] args) {
        String s = "(A+B)*C-(D-E)*(F+G)";
        infixToPrefix(s);
    }

}
