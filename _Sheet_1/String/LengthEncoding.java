package _Sheet_1.String;

public class LengthEncoding {
    String encode(String str) {
        // Your code here
        int n = str.length();
        String s = "";
        int count = 1;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            // System.out.print(i);

            while (i < n - 1 && ch == str.charAt(i + 1)) {
                // System.out.println(ch);
                i++;
                count++;
            }
            s += ch + "" + count + "";
            count = 1;
        }

        return s;

    }
}
