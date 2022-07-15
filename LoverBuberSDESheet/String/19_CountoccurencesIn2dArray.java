package LoverBuberSDESheet.String;

class CountoccurencesIn2dArray {
    public static int solve(int i, int j, String tg, char[][] mat, int idx) {
        int count = 0;
        if (i >= 0 && j >= 0 && i < mat.length && j < mat[0].length && tg.charAt(idx) == mat[i][j]) {
            char temp = tg.charAt(idx);
            mat[i][j] = 0;
            idx++;
            if (idx == tg.length()) {
                count = 1;
            } else {
                count += solve(i + 1, j, tg, mat, idx);
                count += solve(i - 1, j, tg, mat, idx);
                count += solve(i, j + 1, tg, mat, idx);
                count += solve(i, j - 1, tg, mat, idx);
            }

            mat[i][j] = temp;

        }
        return count;
    }

    public static int findOccurrence(char mat[][], String target) {
        // Write your code here
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ans += solve(i, j, target, mat, 0);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        char[][] mat = { { 'S', 'N', 'B', 'S', 'N' },
                { 'B', 'A', 'K', 'E', 'A' },
                { 'B', 'K', 'B', 'B', 'K' },
                { 'S', 'E', 'B', 'S', 'E' } };
        String target = "SNAKES";
        System.out.println(findOccurrence(mat, target));
    }
}
