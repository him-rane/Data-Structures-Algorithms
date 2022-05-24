package Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpanProblem(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n = prices.length;

        st.add(0);
        System.out.print(1 + " ");

        for (int i = 1; i < n; i++) {

            while (!st.empty() && prices[st.peek()] <= prices[i])
                st.pop();

            if (st.isEmpty())
                System.out.print((i + 1) + " ");
            else
                System.out.print((i - st.peek()) + " ");

            st.push(i);

        }
    }

    public static void main(String[] args) {
        int[] prices = { 2, 5, 1, 9, 6, 2, 7, 2, 8, 6 };
        stockSpanProblem(prices);
    }
}
