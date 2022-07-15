package LoverBuberSDESheet.String;

import java.util.ArrayList;

class FindTheStringInGrid {
    static ArrayList<Integer> col = new ArrayList<>();
    static ArrayList<Integer> row = new ArrayList<>();

    public static int search(char[][] grid, int i, int j, String word, int idx) {
        int count = 0;

        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && word.charAt(idx) == grid[i][j]) {
            char temp = word.charAt(idx);
            grid[i][j] = 0;
            idx++;
            if (idx == word.length()) {
                row.add(i);
                col.add(j);
                count = 1;
            } else {
                count += search(grid, i - 1, j, word, idx);
                count += search(grid, i - 1, j + 1, word, idx);
                count += search(grid, i, j + 1, word, idx);
                count += search(grid, i + 1, j + 1, word, idx);
                count += search(grid, i + 1, j, word, idx);
                count += search(grid, i - 1, j - 1, word, idx);
                count += search(grid, i, j - 1, word, idx);
                count += search(grid, i - 1, j - 1, word, idx);
            }

            grid[i][j] = temp;

        }
        return count;
    }

    public int[][] searchWord(char[][] grid, String word) {
        // Code here
        col = new ArrayList<>();
        row = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                search(grid, i, j, word, 0);
            }
        }
        int[][] res = new int[col.size()][2];
        for (int i = 0; i < res.length; i++) {
            res[i][0] = row.get(i);
            res[i][1] = col.get(i);
        }

        return res;

    }

    public static void main(String[] args) {

    }

}
