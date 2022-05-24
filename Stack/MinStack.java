package Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    int min = 0;

    public void push(int x) {
        if (st.isEmpty()) {
            min = x;
            st.push(x);
        } else if (x <= min) {
            min = x;
            st.push(2 * x - min);
        } else
            st.push(x);
    }

    public int pop() {
        if (st.isEmpty())
            return -1;
        int temp = st.pop();
        if (temp <= min) {
            temp = min;
            min = 2 * min - temp;
        }

        return temp;
    }

    public int getMin() {
        return min;
    }

    public int peek() {
        if (st.peek() <= min)
            return min;
        return st.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(-30);
        ms.push(35);
        ms.push(40);
        ms.push(-20);
        ms.push(100);
        ms.push(-50);

        System.out.println(ms.getMin());
    }
}
