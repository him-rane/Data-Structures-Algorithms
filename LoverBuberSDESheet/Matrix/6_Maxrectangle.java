package LoverBuberSDESheet.Matrix;

import java.util.Stack;

class Maxrectangle {
    public static int getMaxArea(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                int val = s.pop();
                int prevSmall = s.isEmpty() ? -1 : s.peek();
                maxArea = Math.max(maxArea, arr[val] * (i - prevSmall - 1));
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            int val = s.pop();
            if (s.isEmpty()) {
                maxArea = Math.max(maxArea, arr[val] * n);
            } else {
                maxArea = Math.max(maxArea, arr[val] * (n - s.peek() - 1));
            }
        }
        return maxArea;
    }

    public static int maxArea(int M[][], int n, int m) {

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] != 0)
                    M[i][j] += M[i - 1][j];
            }
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = getMaxArea(M[i], m);
            res = Math.max(res, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        int M[][] = { { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 } };
        int res = maxArea(M, n, m);
        System.out.println(res);
    }
}
