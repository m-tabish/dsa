
import java.util.ArrayList;
import java.util.List;

class _1971_UnionFind {

    List<Integer> rank = new ArrayList<>(), parent = new ArrayList<>();

    UnionFind(int n) {
        for (int i = 0; i <= n + 1; i++) {
            rank.add(0);
            parent.add(i);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        parent.set(node, findUPar(parent.get(node)));
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int par_u = findUPar(u);
        int par_v = findUPar(v);

        if (par_u == par_v) {
            return;
        }

        if (rank.get(par_u) < rank.get(par_v)) {
            parent.set(par_u, par_v);
        } else if (rank.get(par_v) < rank.get(par_u)) {
            parent.set(par_v, par_u);

        } else {

            parent.set(findUPar(par_u), findUPar(par_v));
            int rankU = rank.get(par_v);
            rank.set(par_v, rankU + 1);
        }

    }
}

class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind uf = new UnionFind(n);

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            uf.unionByRank(u, v);
        }

        return uf.findUPar(source) == uf.findUPar(destination);

    }
}
