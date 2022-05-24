package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreaterElement(int[] arr) {
        int n = arr.length - 1;
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                System.out.print(1 + " ");
            else
                System.out.print(st.peek() + "");

            st.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 15, 0, 8, 6, 12, 9, 8 };
        nextGreaterElement(arr);
    }
}
