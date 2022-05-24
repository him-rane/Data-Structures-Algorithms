package Stack;

import java.util.Stack;

public class LargestRectangularAreaHistogram {
    public static int largestArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.pop()] >= arr[i]) {
                int popIdx = st.pop();
                int currArea = arr[popIdx] * (st.isEmpty() ? i : (i - st.pop() - 1));
                res = Math.max(res, currArea);
            }
            st.push(i);
        }
        while (!st.empty()) {
            int popIdx = st.pop();
            int currArea = arr[popIdx] * (st.isEmpty() ? n : (n - st.pop() - 1));
            res = Math.max(res, currArea);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 3, 7, 1, 9 };
        System.out.println(largestArea(arr));
    }
}
