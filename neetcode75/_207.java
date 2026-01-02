
import java.util.ArrayList;

class _207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] path = new int[numCourses];
        int vis[] = new int[numCourses];

        int pre[][] = prerequisites;

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // creating adj list
        for (int i = 0; i < pre.length; i++) {
            int u = pre[i][1];
            int v = pre[i][0];
            adj.get(u).add(v);
        }

        // checking for cycles in prerequisites
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis, path)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] path) {
        vis[node] = 1;
        path[node] = 1;
        for (int i : adj.get(node)) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis, path)) {
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
