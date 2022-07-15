package LoverBuberSDESheet.String;

import java.util.Stack;

class ParenthesisChecker {
    public static boolean compare(char ch1, char ch2) {
        return (ch1 == '(' && ch2 == ')') || (ch1 == '{' && ch2 == '}') || (ch1 == '[' && ch2 == ']');
    }

    static boolean ispar(String x) {
        Stack<Character> s = new Stack<>();
        int n = x.length();

        for (int i = 0; i < n; i++) {
            char ch = x.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty())
                    return false;
                if (compare(s.peek(), ch) == false)
                    return false;
                s.pop();
            }
        }

        if (!s.isEmpty())
            return false;
        return true;

    }
}
