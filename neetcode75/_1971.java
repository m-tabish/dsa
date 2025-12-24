class _1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length == 0)
            return true;

        boolean[] vis = new boolean[n];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
 

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            map.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            map.computeIfAbsent(v, f -> new ArrayList<>()).add(u);
        }
        return dfs(source, destination, map, vis);

    }

    private boolean dfs(int node, int destination, Map<Integer, ArrayList<Integer>> map, boolean[] vis) {

        if (destination == node)
            return true;
        vis[node] = true;
        for (int neighbour : map.getOrDefault(node, new ArrayList<>())) {
            if (!vis[neighbour]) {
                if (dfs(neighbour, destination, map, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}