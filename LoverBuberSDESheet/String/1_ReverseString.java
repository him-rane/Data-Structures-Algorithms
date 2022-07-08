package LoverBuberSDESheet.String;

class ReverseString {
    public static String stringReverse(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < (n / 2); i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return new String(arr);

    }
}
