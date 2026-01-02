
import java.util.ArrayList;
import java.util.Stack;

class _210 {

    public int[] findOrder(int numCourses, int[][] pre) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int vis[] = new int[numCourses];
        int path[] = new int[numCourses];
        Stack<Integer> st = new Stack<>();

        // initialising adj list
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // creating adj list
        for (int i = 0; i < pre.length; i++) {
            int u = pre[i][0];
            int v = pre[i][1];

            adj.get(v).add(u);
        }

        // checking for cycle 
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, path, vis, st)) {
                    return new int[]{};
                }
            }
        }

        // no cycles found. converting stack to array containing the order of courses 
        int res[] = new int[numCourses];
        int i = 0;

        while (!st.isEmpty()) {
            res[i++] = st.pop();
        }
        return res;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int path[], int vis[], Stack<Integer> st) {
        vis[node] = 1;
        path[node] = 1;

        for (int i : adj.get(node)) {
            if (vis[i] == 0) {
                if (dfs(i, adj, path, vis, st)) {
                    return true;
                }
            } else if (path[i] == 1) {
                return true;
            }
        }

        path[node] = 0;
        st.add(node);
        return false;
    }
}
