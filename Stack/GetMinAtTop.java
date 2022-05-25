package Stack;

import java.util.Stack;

public class GetMinAtTop {
    static int min;

    public static Stack<Integer> _push(int arr[], int n) {
        // your code here
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                st.push(arr[i]);
                min = arr[i];
            } else if (arr[i] <= min) {
                st.push(arr[i] - min);
                min = arr[i];
            } else
                st.push(arr[i]);
        }
        // System.out.println(st);

        return st;
    }

    // Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s) {
        // your code here

        while (!s.isEmpty()) {
            if (s.peek() <= 0) {
                int temp = min;
                min = min - s.pop();
                System.out.print(temp + " ");
            } else {
                s.pop();
                System.out.print(min + " ");
            }
        }

    }
}
