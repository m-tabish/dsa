
import java.util.ArrayList;
import java.util.Collections;

class _TopoSort {

    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> st = new ArrayList<>();

        int vis[] = new int[V];

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        Collections.reverse(st);
        return st;

    }

    private void dfs(int node, int[] vis, ArrayList<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;

        for (int i : adj.get(node)) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }

        }
        st.add(node);
    }
}
