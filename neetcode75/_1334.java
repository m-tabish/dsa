import java.util.Arrays;

class _1334 {
    public int findTheCity(int n, int[][] edges, int dt) {
        int adjMat[][] = new int[n][n];
        int el = edges.length;
        int inf = (int) 1e8;

        // filling adj matrix with inf
        for (int[] adj : adjMat) {
            Arrays.fill(adj, inf);
        }
        
        // filling adj mat with given weights - consider dual edges since UNDIRECTED GRAPH
        for (int i = 0; i < el; i++) {
            int u = edges[i][0];
            int v =  edges[i][1];
            int w = edges[i][2];
            adjMat[u][v] = Math.min(adjMat[u][v] , w );
            adjMat[v][u] = Math.min(adjMat[v][u] , w );
        }

        // performing floyd warshal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (adjMat[j][i] == inf || adjMat[i][k] == inf) continue;
                    if (j == k) // src == dest
                        adjMat[j][k] = 0;
                    adjMat[j][k] = Math.min(adjMat[j][k], adjMat[j][i] + adjMat[i][k]);
                }
            }
        }

        // adjMat has all the shortest paths now pick the ones < distanceThreshold
        int cities[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (adjMat[i][j] <= dt && i != j) {
                    cities[i]++;
                }
            }
        }
     
        int MIN = inf;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (cities[i] <= MIN) {
                MIN = cities[i];
                idx = i;
            }
        }

        return idx;

    }
}