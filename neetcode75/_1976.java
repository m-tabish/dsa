import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

class Pair {
    int node;
    long weight;

    Pair(int node, long weight) {
        this.node = node;
        this.weight = weight;
    }
}

class _1976 {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        PriorityQueue<Pair> q = new PriorityQueue<>((x, y) -> Long.compare(x.weight, y.weight));
Random r = new Random();

        int mod = 1_000_000_007;
        long dist[] = new long[n];
        int ways[] = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            ways[i] = 0;
        }
        for (int road[] : roads) {
            adj.get(road[0]).add(new Pair(road[1], road[2]));
            adj.get(road[1]).add(new Pair(road[0], road[2]));
        }
        dist[0] = 0;
        ways[0] = 1;

        q.add(new Pair(0, 0));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int node = pair.node;
            long cost = pair.weight;

            for (Pair it : adj.get(node)) {
                int adjNode = it.node;
                long edW = it.weight;

                if (cost + edW < dist[adjNode]) {
                    dist[adjNode] = cost + edW;
                    ways[adjNode] = ways[node];
                    q.add(new Pair(adjNode, cost + edW));
                } else if (cost + edW == dist[adjNode]) {
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
                }
            }
        }
        return ways[n - 1] % mod;
    }
}