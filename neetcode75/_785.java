class _785{
    public boolean isBipartite(int[][] graph) {
        int m = graph.length, n = graph[0].length;
        int col[] = new int[m];
 

        for (int i = 0; i < m; i++) {
            col[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            if (col[i] == -1) {
                if (dfs(i, 0,  graph, col) == false)
                    return false;
                ;
            }
        }
        return true;

    }

    private boolean dfs(int node, int c, int[][] graph, int[] col) {
        col[node] = c;

        for (int i : graph[node]) {
            if (col[i] == -1) {
                if (dfs(i, 1 - c, graph, col) == false)
                    return false;
            } else if (col[i] == c) {
                return false;
            }
        }
        return true;
    }
}