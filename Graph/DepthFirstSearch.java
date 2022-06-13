package Graph;

import java.util.ArrayList;

public class DepthFirstSearch {

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

    public static void DFSHelper(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.println(s);
        for (int v : adj.get(s)) {
            if (visited[v] == false)
                DFSHelper(adj, v, visited);
        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[adj.size()];
        for (int s = 0; s < v; s++) {
            if (visited[s] == false) {
                DFSHelper(adj, s, visited);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = adjacencyListImplementation();
        DFS(adj, adj.size());
        System.out.println(adj);
    }
}
