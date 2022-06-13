package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BreadthFirstSearch {

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

    public static void BFShelper(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(s);
        visited[s] = true;
        while (q.size() > 0) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                if (visited[v] == false) {
                    q.add(v);
                    visited[v] = true;
                }
            }
            System.out.println();
        }
    }

    public static void BFS(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[adj.size()];
        for (int s = 0; s < v; s++) {
            if (visited[s] == false) {
                BFShelper(adj, s, visited);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = adjacencyListImplementation();
        BFS(adj, adj.size());
        System.out.println(adj);
    }
}
