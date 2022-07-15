package LoverBuberSDESheet.SearchingAndSorting;

import java.util.Arrays;

class MinimumSwapsToSort {
    public static int minSwaps(int nums[]) {
        int n = nums.length;

        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        Arrays.sort(pair, (a, b) -> (a[0] - b[0]));
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (pair[i][1] == i)
                continue;
            else {
                count++;
                int p1 = pair[pair[i][1]][0];
                int p2 = pair[pair[i][1]][1];

                pair[pair[i][1]][0] = pair[i][0];
                pair[pair[i][1]][1] = pair[i][1];

                pair[i][0] = p1;
                pair[i][1] = p2;

                i--;

            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 1, 7, 6, 4, 9, 8, 3, 2, 6, };
        System.out.println(minSwaps(nums));
    }
}
