package _Sheet_1.Searching;

public class MajorityElement {
    static int majorityElement(int a[], int size) {
        // your code here
        int count = 1;
        int maj = a[0];
        for (int i = 1; i < size; i++) {
            if (a[i] == maj)
                count++;
            else {
                count--;
                if (count == 0) {
                    count = 1;
                    maj = a[i];
                }
            }
        }

        count = 0;
        for (int i = 0; i < size; i++) {
            if (maj == a[i])
                count++;
        }
        if (count > (size / 2))
            return maj;
        return -1;

    }
}
