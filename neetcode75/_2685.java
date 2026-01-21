class _2685 {

    public int countCompleteComponents(int n, int[][] edges) {
        // complete connected components

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        boolean vis[] = new boolean[n];
        int ind[] = new int[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            vis[i] = false;
        }

        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                ArrayList<Integer> list = new ArrayList<>();
                dfs(adj, vis, ind, i, list);
                int size = list.size();
                boolean complete = true;
                for (int node : list) {
                    if (adj.get(node).size() != size - 1) {
                        complete = false;
                        break;
                    }
                }

                if (complete)
                    count++;
            }
        }

        return count;
    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int[] ind, int curr, ArrayList<Integer> list) {
        vis[curr] = true;
        ind[curr] += 1;
        list.add(curr);
        for (int edge : adj.get(curr)) {
            if (!vis[edge]) {
                dfs(adj, vis, ind, edge, list);
            }
        }
        return;
    }
}