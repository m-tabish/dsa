
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _Kahn {

    public ArrayList<Integer> topoSort(int V, int[][] edges) {

        Queue<Integer> q = new LinkedList<>();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int[] indegree = new int[V];

        // initialising adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // creating adjacency list
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
        }

        // calculating indegree of nodes
        for (int i = 0; i < edges.length; i++) {
            indegree[edges[i][1]]++;
        }

        // adding all nodes with indegree=0 to queue
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();

            list.add(node);

            for (int i : adj.get(node)) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }
        }
        return list;
    }

}
