package DP;

public class ArrangeBuilding {
    public static long arrangeBuilding(int n) {
        long prevOne = 1;
        long prevZero = 1;
        long currOne = 0;
        long currZero = 0;
        for (int i = 1; i < n; i++) {
            currOne = prevOne + prevZero;
            currZero = prevOne;

            prevOne = currOne;
            prevZero = currZero;
        }

        return ((prevOne + prevZero) * (prevOne + prevZero));
    }

    public static void main(String[] args) {

    }

}
