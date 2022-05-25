package Stack;

import java.util.Stack;

public class EvaluationOfPostfix {
    public static int compute(char a, char b, char op) {
        if (op == '+')
            return Integer.valueOf(a) + Integer.valueOf(b);
        else if (op == '-')
            return Integer.valueOf(a) - Integer.valueOf(b);
        else if (op == '/')
            return Integer.valueOf(a) / Integer.valueOf(b);
        else if (op == '*')
            return Integer.valueOf(a) * Integer.valueOf(b);
        else
            return (int) Math.pow(Integer.valueOf(a), Integer.valueOf(b));
    }

    public static int evaluationOfPostfix(String s) {
        int res = Integer.valueOf(s.charAt(0));
        Stack<Character> st = new Stack<>();
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                st.push(s.charAt(i));
            } else {
                char op1 = st.pop();
                char op2 = st.pop();
                int computeValue = compute(op1, op2, s.charAt(i));

                st.push((char) computeValue);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "10 2 3 ^ ^ ^";

    }
}
