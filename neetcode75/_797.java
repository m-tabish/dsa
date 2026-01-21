import java.util.ArrayList;
import java.util.List;

class _797 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<Integer> path = new ArrayList<>();
        dfs(0, graph, path);
        return res;
    }

    private void dfs(int node, int[][] graph, ArrayList<Integer> path) {
        path.add(node);
        if (node == graph.length - 1) {
            res.add(new ArrayList(path));

        } else {
            for (int next : graph[node]) {
                dfs(next, graph, path);
            }
        }
        path.remove(path.size() - 1);
    }
}