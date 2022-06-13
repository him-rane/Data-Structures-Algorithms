package _Sheet_1.Arrays;

import java.util.ArrayList;

public class MaxAndSecondMax {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        // code here.
        int max1 = arr[0];
        int max2 = -1;
        for (int i = 1; i < sizeOfArray; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            }
            if (max1 != arr[i]) {
                if (max2 == -1)
                    max2 = arr[i];
                else if (max2 < arr[i])
                    max2 = arr[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(max1);
        list.add(max2);

        return list;

    }
}
