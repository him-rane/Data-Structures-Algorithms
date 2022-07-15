package LoverBuberSDESheet.SearchingAndSorting;

class MiddleOfThree {
    static int middle(int A, int B, int C) {

        int mi = Math.min(A, Math.min(B, C));
        int ma = Math.max(A, Math.max(B, C));
        return (A + B + C) - (mi + ma);
    }

    public static void main(String[] args) {
        int A = 2, B = 5, C = 3;
        System.out.println(middle(A, B, C));
    }
}