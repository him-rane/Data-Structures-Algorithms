package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ShortestPathInAnUnweightedGraph {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static ArrayList<ArrayList<Integer>> adjacencyListImplementation() {
        int v = 9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 6, 7);
        addEdge(adj, 6, 8);
        addEdge(adj, 5, 8);
        addEdge(adj, 5, 6);

        return adj;
    }

    public static void BFShelper(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int[] dist) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;
        while (q.size() > 0) {
            int u = q.poll();

            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    dist[v] = dist[u] + 1;
                    q.add(v);
                    visited[v] = true;
                }
            }

        }
    }

    public static void BFS(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean[] visited = new boolean[adj.size()];
        int[] dist = new int[v];
        for (int i = 0; i < v; i++) {
            dist[i] = -1;
        }
        dist[0] = 0;
        BFShelper(adj, s, visited, dist);

        for (int i = 0; i < v; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = adjacencyListImplementation();
        BFS(adj, adj.size(), 0);
    }
}
