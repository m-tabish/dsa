import java.util.ArrayList;
import java.util.PriorityQueue;
class Pair{
    int val;
    int w;
    
    Pair(int val, int w){
        this.val = val;
        this.w= w;
    }
}
public class _dijkstra {
    public int[] dijkstra(int V, int[][] edges, int src) {
        
        PriorityQueue<Pair> q = new PriorityQueue<Pair>((x,y)->x.w - y.w);
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int dist[] = new int[V];
        
        // initialise adj list
        for(int i =0 ;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        // filling the adj list
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w =edge[2];
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }
        
        
        //filling dist = Integer.MAX_VALUE
        for(int i=0;i<V;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        
        //implementing bfs
        
        q.add(new Pair(src, 0));
        dist[src] = 0;
        
        while(!q.isEmpty()){
            Pair pair = q.poll();
            
            int node = pair.val;
            int w = pair.w;
            
            for(Pair it: adj.get(node)){
                int n = it.val;
                int d = it.w;
                
                if(d + w < dist[n]){
                    dist[n] = d +w;
                    q.add(new Pair(n, dist[n]));
                }
            }
        }
        
        
        return dist;
        
    }
}