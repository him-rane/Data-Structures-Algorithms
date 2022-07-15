package LoverBuberSDESheet.String;

class MinimumSwapsForBracketBalancing {
    static int minimumNumberOfSwaps(String S) {
        int countLeft = 0, countRight = 0, swap = 0, fault = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '[') {
                countLeft++;
                if (fault > 0) {
                    swap += fault;
                    fault--;
                }
            } else {
                countRight++;
                fault = (countRight - countLeft);
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        String S = "[[]]][]][[";
        System.out.println(minimumNumberOfSwaps(S));
    }
}
