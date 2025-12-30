
import java.util.ArrayList;

class _CycleDAG {

    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean[] vis = new boolean[V];
        int[] path = new int[V];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
        }

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, path, adj, vis) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int node, int[] path, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        path[node] = 1;

        for (int i : adj.get(node)) {
            if (!vis[i]) {
                if (dfs(i, path, adj, vis) == true) {
                    return true;
                }
            } else if (path[i] == 1) {
                return true;
            }
        }
        path[node] = 0;
        return false;
    }
}
