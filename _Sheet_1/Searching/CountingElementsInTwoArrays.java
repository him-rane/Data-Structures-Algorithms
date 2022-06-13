package _Sheet_1.Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingElementsInTwoArrays {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {

        Arrays.sort(arr2);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int tg = arr1[i];
            int low = 0;
            int high = n - 1;
            int res = 0;
            if (tg < arr2[0]) {
                res = 0;
                list.add(res);

            }

            else {
                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (arr2[mid] == tg) {
                        res = mid;
                        low = mid + 1;
                    } else if (arr2[mid] < tg) {
                        res = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                list.add(res + 1);
            }
        }
        return list;
    }
}
