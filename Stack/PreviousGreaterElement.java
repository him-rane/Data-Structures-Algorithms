package Stack;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void previousGreaterElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                System.out.print(-1 + " ");
            else
                System.out.print(st.peek() + " ");
            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 15, 10, 18, 12, 4, 6, 2, 8 };
        previousGreaterElement(arr);
    }
}
