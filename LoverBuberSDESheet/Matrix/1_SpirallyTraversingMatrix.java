package LoverBuberSDESheet.Matrix;

import java.util.ArrayList;

class SpirallyTraversingMatrix {
    public static ArrayList<Integer> spiralTraversal(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, right = m - 1, buttom = n - 1, left = 0;
        while (top <= buttom && left <= right) {
            for (int i = top; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= buttom; i++) {
                list.add(mat[i][right]);
            }
            right--;

            if (top < buttom) {
                for (int i = right; i >= left; i--) {
                    list.add(mat[buttom][i]);
                }
                buttom--;
            }

            if (left < right) {
                for (int i = buttom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }

        }

        return list;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        System.out.println(spiralTraversal(mat));
    }
}
