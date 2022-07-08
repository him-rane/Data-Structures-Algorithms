package LoverBuberSDESheet.Matrix;

import java.util.Arrays;

class SortedMatrix {
    public static int[][] sortedMatrix(int N, int Mat[][]) {
        int[] temp = new int[N * N];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[idx] = Mat[i][j];
                idx++;
            }
        }

        Arrays.sort(temp);
        idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = temp[idx];
                idx++;
            }
        }

        return Mat;
    }

    public static void main(String[] args) {
        int[][] Mat = { { 1, 2, 3, 4 }, { 3, 2, 1, 5 }, { 7, 5, 4, 2 }, { 3, 2, 5, 1 } };
        int N = Mat.length;
        Mat = sortedMatrix(N, Mat);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
