package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class DetectCycleInUndirectedGraph {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static ArrayList<ArrayList<Integer>> adjacencyListImplementation() {
        int v = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        // addEdge(adj, 0, 4);
        // addEdge(adj, 1, 2);
        // addEdge(adj, 1, 3);
        // addEdge(adj, 1, 4);
        // addEdge(adj, 2, 3);
        // addEdge(adj, 3, 4);
        // addEdge(adj, 6, 7);
        // addEdge(adj, 6, 8);
        // addEdge(adj, 5, 8);
        // addEdge(adj, 5, 6);

        return adj;
    }

    public static boolean DFSHelper(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        // System.out.println(s);
        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                if (DFSHelper(adj, u, visited, s) == true)
                    return true;
            } else if (u != parent)
                return true;

        }
        return false;
    }

    public static boolean detetCycle(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[adj.size()];
        for (int s = 0; s < v; s++) {
            if (visited[s] == false) {
                if (DFSHelper(adj, s, visited, -1) == true)
                    return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = adjacencyListImplementation();
        boolean cycle = detetCycle(adj, adj.size());
        System.out.println(cycle);
    }
}
