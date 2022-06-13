package _Sheet_1.Searching;

public class IndexOfExtraElement {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != b[i])
                return i;
        }

        return n - 1;
    }
}
