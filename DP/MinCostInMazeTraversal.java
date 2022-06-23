package DP;

public class MinCostInMazeTraversal {
    public static int minCost(int[][] maze) {
        int n = maze.length;
        int m = maze[0].length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1)
                    maze[i][j] = maze[i][j];
                else if (i == n - 1)
                    maze[i][j] = maze[i][j] + maze[i][j + 1];
                else if (j == m - 1)
                    maze[i][j] = maze[i][j] + maze[i + 1][j];
                else
                    maze[i][j] = maze[i][j] + Math.min(maze[i][j + 1], maze[i + 1][j]);
            }
        }

        return maze[0][0];
    }

    public static void main(String[] args) {
        int[][] maze = { { 1, 2, 3 },
                { 4, 8, 2 },
                { 1, 5, 3 } };
        int res = minCost(maze);
        System.out.println(res);
    }
}
