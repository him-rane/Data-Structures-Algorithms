package Matrix;

import java.util.ArrayList;

public class SpirallyTraversingMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // code here

        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, right = c - 1, buttom = r - 1, left = 0;
        while (top <= buttom && left <= right) {
            for (int i = top; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= buttom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= buttom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[buttom][i]);
                }
                buttom--;
            }

            if (left <= right) {
                for (int i = buttom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }

        return list;
    }
}
