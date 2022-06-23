package DP;

public class PaintHouseManyColors {
    public static int paintHouseManyColors(int[][] arr) {

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] <= min) {
                smin = min;
                min = arr[0][j];
            } else if (arr[0][j] <= smin) {
                smin = arr[0][j];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            int cmin = Integer.MAX_VALUE;
            int csmin = Integer.MAX_VALUE;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i - 1][j] != min) {
                    arr[i][j] += min;
                } else {
                    arr[i][j] += smin;
                }

                if (arr[i][j] <= cmin) {
                    csmin = cmin;
                    cmin = arr[i][j];
                } else if (arr[i][j] <= csmin) {
                    csmin = arr[i][j];
                }
            }

            min = cmin;
            smin = csmin;
        }

        return (min);
    }

    public static void main(String[] args) {

    }
}
