class Tuple {
    int dist, node, stop;

    Tuple(int stop, int node, int dist) {
        this.dist = dist;
        this.node = node;
        this.stop = stop;
    }
}

class Pair {
    int dest, price;

    Pair(int dest, int price) {
        this.dest = dest;
        this.price = price;
    }
}

public class _787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // {stops , node, dist }

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        Queue<Tuple> q = new LinkedList<>();

        int dist[] = new int[n];
        Arrays.fill(dist, (int) 1e9);

        // instantiate the array
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // create graph
        for (int i = 0; i < flights.length; i++) {
            int u = flights[i][0];
            int v = flights[i][1];
            int pr = flights[i][2];
            adj.get(u).add(new Pair(v, pr));
        }

        q.add(new Tuple(0, src, 0));

        dist[src] = 0;

        while (!q.isEmpty()) {
            Tuple tup = q.poll();
            int stop = tup.stop;
            int node = tup.node;
            int cost = tup.dist;

            if (stop > k)
                continue;
            for (Pair it : adj.get(node)) {
                int adjNode = it.dest;
                int price = it.price;

                if (cost + price < dist[adjNode] && stop <= k) {
                    dist[adjNode] = cost + price;
                    q.add(new Tuple(stop + 1, adjNode, cost + price));
                }
            }

        }

        if( dist[dst] == (int) 1e9) return -1 ;
        return  dist[dst];
    }
}