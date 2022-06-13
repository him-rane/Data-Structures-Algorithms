package _Sheet_1.Arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        while (i < n && j < n) {

            if (sum + arr[j] == s) {
                break;
            }

            else if (sum + arr[j] > s) {
                sum -= arr[i];
                i++;
            } else {
                sum += arr[j];
                j++;
            }

        }

        if (j < n && sum + arr[j] == s) {
            list.add(i + 1);
            list.add(j + 1);
            return list;
        } else {
            list.add(-1);
            return list;
        }
    }
}
