package LoverBuberSDESheet.Array;

import java.util.ArrayList;

class CommonElements {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n1 && j < n2 && k < n3) {

            if (A[i] == B[j] && B[j] == C[k]) {
                if (list.size() == 0)
                    list.add(A[i]);

                else if (list.get(list.size() - 1) != A[i])
                    list.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j])
                i++;
            else if (B[j] < C[k])
                j++;
            else
                k++;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4 };
        int[] B = { 1, 4, 5 };
        int[] C = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(commonElements(A, B, C, A.length, B.length, C.length));
    }

}
