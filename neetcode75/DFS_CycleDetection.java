import java.util.ArrayList;

class DFS_CycleDetection {

    private boolean dfs(int start, int parent, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[start] = 1;

        for (int adjnode : adj.get(start)) {
            if (vis[adjnode] == 0) {
                if (dfs(adjnode, start, adj, vis) == true)
                    return true;
            } else if (adjnode != parent)
                return true;
        }

        return false;

    }

    public boolean isCycle(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int vis[] = new int[V];


        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfs(i, -1, adj, vis) == true)
                    return true;
            }
        }
        return false;

    }


}
