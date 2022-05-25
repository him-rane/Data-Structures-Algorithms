package Stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {

    // public static char[] precedence={'-','+','*','/','^'};
    public static void infixToPostfix(String s) {
        HashMap<Character, Integer> precedence = new HashMap<>();

        precedence.put('-', 1);
        precedence.put('+', 2);
        precedence.put('*', 3);
        precedence.put('/', 4);
        precedence.put('^', 5);

        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    System.out.print(st.peek() + " ");
                    st.pop();
                }
                st.pop();
            }

            else if (precedence.containsKey(ch) == false) {

                System.out.print(ch + " ");
            } else {
                if (st.isEmpty())
                    st.push(ch);
                else {
                    while (!st.isEmpty() && precedence.containsKey(st.peek())
                            && precedence.get(ch) < precedence.get(st.peek())) {
                        System.out.print(st.peek() + " ");
                        st.pop();
                    }
                    st.push(ch);
                }

            }
            // System.out.println(st);

        }
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }

    }

    public static void main(String[] args) {
        String s = "(A+B)*C-(D-E)*(F+G)";
        infixToPostfix(s);
    }
}
