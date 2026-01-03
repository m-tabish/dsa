
import java.util.ArrayList;
import java.util.List;

class _802 {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length, m = graph[0].length;
        ArrayList<Integer> list = new ArrayList<>();

        int[] vis = new int[n];
        int[] path = new int[n];
        int[] check = new int[n];

        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                dfs(i, graph, list, vis, path, check);
            }
        }

        for (int i = 0; i < n; i++) {
            if (check[i] == 1) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean dfs(int node, int[][] graph, ArrayList<Integer> list, int[] vis, int[] path, int[] check) {

        vis[node] = 1;
        path[node] = 1;
        check[node] = 0;

        for (int i : graph[node]) {

            if (vis[i] == 0) {
                {
                    if (dfs(i, graph, list, vis, path, check)) {
                        return true;
                    }
                }
            } else if (path[i] == 1) {
                return true;
            }

        }

        path[node] = 0;
        check[node] = 1;
        return false;
    }
}
