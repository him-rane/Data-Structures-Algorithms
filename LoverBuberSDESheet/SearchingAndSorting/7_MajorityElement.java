package LoverBuberSDESheet.SearchingAndSorting;

class MajorityElement {
    static int majorityElement(int a[], int size) {
        // your code here
        int maj = a[0];
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (a[i] == maj)
                count++;
            else {
                count--;
                if (count == 0) {
                    maj = a[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == maj)
                count++;
        }

        if (count > size / 2)
            return maj;
        return -1;
    }
}
