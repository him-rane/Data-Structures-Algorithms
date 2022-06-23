package _Sheet_1.String;

public class PaintHouse {
    public static int PaintHouse(int[][] cost) {
        int n = cost.length;

        int prevR = cost[0][0];
        int prevB = cost[0][1];
        int prevG = cost[0][2];

        int currR = 0;
        int currB = 0;
        int currG = 0;

        for (int i = 1; i < n; i++) {
            currR = cost[i][0] + Math.min(prevB, prevG);
            currB = cost[i][1] + Math.min(prevR, prevG);
            currG = cost[i][2] + Math.min(prevR, prevB);

            prevR = currR;
            prevB = currB;
            prevG = currG;
        }
        return (Math.min(prevG, Math.min(prevR, prevB)));
    }

    public static void main(String[] args) {
        int[][] cost = { { 2, 3, 5 }, { 3, 5, 2 }, { 1, 2, 5 } };
    }
}
