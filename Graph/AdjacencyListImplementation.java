package Graph;

import java.util.ArrayList;

public class AdjacencyListImplementation {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static ArrayList<ArrayList<Integer>> adjacencyListImplementation() {
        int v = 5;
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

        return adj;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = adjacencyListImplementation();
        System.out.println(adj);
    }
}
