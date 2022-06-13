package _Sheet_1.Arrays;

public class RearrangeAnArray {
    static void arrange(long arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + ((arr[(int) arr[i]] % (long) n) * (long) n);
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }

    public static void main(String[] args) {

    }
}
