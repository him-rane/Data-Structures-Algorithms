package Graph;

import java.util.ArrayList;

public class DetectCycleInDirected {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static ArrayList<ArrayList<Integer>> adjacencyListImplementation() {
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        // addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        // addEdge(adj, 3, 3);

        return adj;
    }

    public static boolean DFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, boolean[] recStack) {
        visited[s] = true;
        recStack[s] = true;
        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                if (DFS(adj, u, visited, recStack) == true)
                    return true;
            } else if (recStack[u] == true)
                return true;
        }

        return false;

    }

    public static boolean detectCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];
        for (int s = 0; s < v; s++) {
            if (visited[s] == false) {
                if (DFS(adj, s, visited, recStack) == true)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = adjacencyListImplementation();
        boolean cycle = detectCycle(adj, adj.size());
        System.out.println(cycle);
        System.out.println(adj);
    }
}
