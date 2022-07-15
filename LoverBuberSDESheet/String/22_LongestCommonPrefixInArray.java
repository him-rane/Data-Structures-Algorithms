package LoverBuberSDESheet.String;

import java.util.Arrays;

class LongestCommonPrefixInArray {
    public static String longestCommonPrefix(String arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        while (count < arr[0].length() && count < arr[n - 1].length()
                && arr[0].charAt(count) == arr[n - 1].charAt(count)) {
            count++;
        }
        if (arr[0].substring(0, count).length() == 0)
            return "-1";
        return arr[0].substring(0, count);

    }

    public static void main(String[] args) {
        int n = 4;
        String[] arr = { "geeksforgeeks", "geeks", "geek",
                "geezer" };
        System.out.println(longestCommonPrefix(arr, n));
    }
}
