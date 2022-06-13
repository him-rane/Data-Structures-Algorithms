package _Sheet_1.Searching;

public class FindTransitionPoint {
    int transitionPoint(int arr[], int n) {

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != arr[i])
                return i;
        }
        if (arr[n - 1] == 1)
            return 0;
        else
            return -1;

    }
}
