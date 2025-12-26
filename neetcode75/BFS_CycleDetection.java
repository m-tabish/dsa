import java.util.*;

class CycleDetectionBFS {

    public boolean bfs(int start, List<Integer>[] adj, boolean[] vis) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { start, -1 });
        vis[start] = true;

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int node = cur[0];
            int parent = cur[1];

            for (int neigh : adj[node]) {

                if (!vis[neigh]) {
                    vis[neigh] = true;
                    q.add(new int[] { neigh, node });
                } else if (neigh != parent) {
                    // visited & not parent → cycle
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {

        boolean[] vis = new boolean[V];

        @SuppressWarnings("unchecked")
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        // check all components
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (bfs(i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}
