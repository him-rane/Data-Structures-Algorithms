package LoverBuberSDESheet.Array;

import java.util.ArrayList;

class StockBuyAndSell {
    public static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (A[i - 1] < A[i]) {
                int start = i - 1;
                while (i < n && A[i - 1] < A[i])
                    i++;
                ArrayList<Integer> l = new ArrayList<>();
                l.add(start);
                l.add(i - 1);
                list.add(l);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] A = { 2, 1, 4, 2, 6, 4, 3, 7, 1, 9, 5, 4 };
        int n = A.length;
        System.out.println(stockBuySell(A, n));

    }
}
