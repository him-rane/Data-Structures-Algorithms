package Sorting;

public class CycleSort {

    public static void cycleSort(int[] arr) {
        int n = arr.length;
        for (int cycle = 0; cycle < n - 1; cycle++) {
            int item = arr[cycle];
            int pos = cycle;
            for (int i = cycle + 1; i < n; i++) {
                if (arr[i] < item)
                    pos++;
            }
            if (pos == cycle)
                continue;

            while (item == arr[pos])
                pos += 1;

            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (cycle != pos) {
                pos = cycle;
                for (int i = cycle + 1; i < n; i++) {
                    if (arr[i] < item)
                        pos++;
                }
                while (item == arr[pos])
                    pos += 1;

                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 7, 6, 9, 5, 1, 2 };
        cycleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
