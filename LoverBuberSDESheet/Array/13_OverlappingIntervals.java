package LoverBuberSDESheet.Array;

import java.util.ArrayList;
import java.util.Arrays;

class OverlappingIntervals {
    public static int[][] overlappedInterval(int[][] Intervals) {
        // Code here // Code here
        int n = Intervals.length;

        Arrays.sort(Intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        ArrayList<ArrayList<Integer>> tempAns = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(Intervals[0][0]);
        list.add(Intervals[0][1]);

        tempAns.add(list);
        int idx = 1;

        for (int i = 1; i < n; i++) {
            if (tempAns.get(idx - 1).get(1) >= Intervals[i][0]) {
                ArrayList<Integer> ls = new ArrayList<>();

                ls.add(tempAns.get(idx - 1).get(0));
                ls.add(Math.max(tempAns.get(idx - 1).get(1), Intervals[i][1]));
                tempAns.remove(idx - 1);

                tempAns.add(ls);
            } else {
                ArrayList<Integer> ls = new ArrayList<>();

                ls.add(Intervals[i][0]);
                ls.add(Intervals[i][1]);

                tempAns.add(ls);
                idx++;
            }

        }

        int[][] ans = new int[tempAns.size()][2];
        for (int i = 0; i < tempAns.size(); i++) {
            ans[i][0] = tempAns.get(i).get(0);
            ans[i][1] = tempAns.get(i).get(1);

        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] Intervals = { { 1, 3 }, { 3, 5 }, { 6, 9 }, { 10, 18 } };
        int[][] ans = overlappedInterval(Intervals);
        for (int i = 0; i < Intervals.length; i++) {
            System.out.println(Intervals[i][0] + " " + Intervals[i][1]);
        }

    }
}
