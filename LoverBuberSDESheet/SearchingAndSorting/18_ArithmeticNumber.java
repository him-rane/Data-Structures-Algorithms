package LoverBuberSDESheet.SearchingAndSorting;

class ArithmeticNumber {
    static int inSequence(int a, int b, int c) {
        if (c == 0) {
            if (a == b)
                return 1;
            else
                return 0;
        } else {
            if ((b - a) / c < 0)
                return 0;

            else {
                if ((b - a) % c == 0)
                    return 1;
                else
                    return 0;
            }
        }

    }

    public static void main(String[] args) {

    }
}
