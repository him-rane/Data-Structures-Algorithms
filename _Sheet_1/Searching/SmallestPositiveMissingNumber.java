package _Sheet_1.Searching;

public class SmallestPositiveMissingNumber {
    static int findMissing(int arr[], int size) {
        boolean isOne = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 1)
                isOne = true;
            if (arr[i] <= 0 || arr[i] > size)
                arr[i] = 1;
        }
        if (!isOne)
            return 1;
        for (int i = 0; i < size; i++) {
            int idx = Math.abs(arr[i]) - 1;
            arr[idx] = -Math.abs(arr[idx]);
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0)
                return i + 1;
        }

        return size + 1;

    }
}
