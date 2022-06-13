package Graph;

import java.util.Arrays;

public class PrimsAlgorithm {
    public static int primsAlgorithm(int[][] graph, int V) {
        int res = 0;
        int[] key = new int[V];

        Arrays.fill(key, Integer.MAX_VALUE);

        key[0] = 0;

        boolean mSet[] = new boolean[V];

        for (int count = 0; count < V; count++) {
            int u = -1;
            for (int i = 0; i < V; i++) {
                if (mSet[i] == false && ((u == -1) || key[i] < key[u]))
                    u = i;
            }
            mSet[u] = true;
            res += key[u];

            for (int v = 0; v < V; v++) {
                if (mSet[v] == false && graph[u][v] != 0 && graph[u][v] < key[v])
                    key[v] = graph[u][v];
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[][] graph = { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        int V = graph.length;
        int res = primsAlgorithm(graph, V);
        System.out.println(res);
    }
}
