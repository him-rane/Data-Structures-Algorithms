package LoverBuberSDESheet.SearchingAndSorting;

import java.util.ArrayList;

class ValueEqualToIndexValue {
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1)
                list.add(i + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 3, 5, 6, 5, 8 };
        int n = arr.length;
        System.out.println(valueEqualToIndex(arr, n));
    }
}
