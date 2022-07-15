package LoverBuberSDESheet.SearchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;

class FindAllFourSumNumbers {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int x) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int x1 = x - arr[i];
            for (int j = i + 1; j < n; j++) {
                int x2 = x1 - arr[j];

                int l = j + 1, r = n - 1;
                while (l < r) {
                    int sum = arr[l] + arr[r];

                    if (sum > x2) {
                        r--;
                    } else if (sum < x2) {
                        l++;
                    } else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
                        ans.add(list);

                        while (l < r && arr[l] == list.get(2))
                            ++l;
                        while (l < r && arr[r] == list.get(3))
                            --r;

                    }

                }

                while (j + 1 < n && arr[j + 1] == arr[j])
                    ++j;
            }
            while (i + 1 < n && arr[i + 1] == arr[i])
                ++i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 2, 2, 3, 3, 4, 4 };
        int x = 10;
        System.out.println(fourSum(arr, x));
    }
}
