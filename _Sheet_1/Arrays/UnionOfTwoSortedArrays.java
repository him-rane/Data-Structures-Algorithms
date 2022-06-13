package _Sheet_1.Arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (i != 0 && arr1[i - 1] == arr1[i])
                i++;
            else if (j != 0 && arr2[j - 1] == arr2[j])
                j++;
            else if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else {
                list.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            if (i != 0 && arr1[i - 1] == arr1[i])
                i++;
            else {
                list.add(arr1[i]);
                i++;
            }
        }
        while (j < m) {
            if (j != 0 && arr2[j - 1] == arr2[j])
                j++;
            else {
                list.add(arr2[j]);
                j++;
            }
        }
        return list;
    }
}
