package Stack;

import java.util.Stack;

public class LargestRectangleOfOnes {
    public static int largestArea(int[] arr) {
        int n = arr.length;
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                int popIdx = st.pop();
                int curr = arr[popIdx] * (st.isEmpty() ? i : (i - st.peek() - 1));
                res = Math.max(res, curr);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int popIdx = st.pop();
            int curr = arr[popIdx] * (st.isEmpty() ? n : (n - st.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }

    public static int largestRectangleOfOnes(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int res = largestArea(mat[0]);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != 0) {
                    mat[i][j] += mat[i - 1][j];
                }
            }
            res = Math.max(res, largestArea(mat[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 1 }
        };
        System.out.println(largestRectangleOfOnes(mat));
    }

}
