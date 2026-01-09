
// v , w

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair {
    int v, w;

    Pair(int v, int w) {
        this.v = v;
        this.w = w;
    }
}

class _743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        PriorityQueue<Pair> q = new PriorityQueue<>((x, y) -> x.w - y.w);
        n = n + 1;
        int time[] = new int[n];
        // instantiate graph
        for (int i = 0; i < n; i++) {
            time[i] = (int) 1e9;
            adj.add(new ArrayList<>());
        }

        // create graph
        for (int i = 0; i < times.length; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj.get(u).add(new Pair(v, w));
        }
        time[k] = 0;
        int res = 0;

        q.add(new Pair(k, 0)); // count , node , weight
        time[k] = 0;

        while (!q.isEmpty()) {
            Pair tup = q.poll();
            int node = tup.v;
            int weight = tup.w;

            for (Pair adjNode : adj.get(node)) {
                int v = adjNode.v;
                int edW = adjNode.w;

                if (weight + edW < time[v]) {
                    time[v] = weight + edW;
                    q.add(new Pair(v, edW + weight));
                }
            }

        }

        for (int i = 1; i < time.length; i++) {
            res = Math.max(res, time[i]);
        }
        return res == (int) 1e9 ? -1 : res;

    }
}