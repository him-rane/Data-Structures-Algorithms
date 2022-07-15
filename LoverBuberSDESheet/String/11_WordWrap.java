package LoverBuberSDESheet.String;

class WordWrap {
    public static int sol(int i, int rem, int[] words, int k, int[][] dp) {
        if (i == words.length) {
            return 0;
        }

        if (dp[i][rem] != 0)
            return dp[i][rem];

        if (words[i] > rem) {
            return dp[i][rem] = (rem + 1) * (rem + 1) + sol(i + 1, k - words[i] - 1, words, k, dp);

        } else {
            int currLine = sol(i + 1, rem - words[i] - 1, words, k, dp);
            int nextLine = (rem + 1) * (rem + 1) + sol(i + 1, k - words[i] - 1, words, k, dp);
            return dp[i][rem] = Math.min(nextLine, currLine);

        }
    }

    public static void main(String[] args) {

        int[] words = { 3, 2, 2, 5 };
        int n = words.length;
        int cap = 6;
        int remCap = cap;
        int[][] dp = new int[505][2005];
        // System.out.println(sol(words, n, cap, remCap, dp));
    }
}
