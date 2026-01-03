import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {
        // code here
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        int dist[] = new int[V];
        
        for(int i=0 ;i<V;i++){
            adj.add(new ArrayList<>());
            dist[i] = Integer.MAX_VALUE;
        }
        
         
        
        for(int edge[] :edges){
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        q.add(src);
        
        dist[src] = 0;
        
        while(!q.isEmpty()){
            
            int node = q.poll();
            
            for(int i : adj.get(node)){
                if(dist[node] +1< dist[i]){
                    dist[i] = dist[node]+1;
                    q.add(i);
                }
            }
        }
        
        
        // For unreacheable nodes
        for(int i =0 ;i<V;i++){
            if(dist[i] == Integer.MAX_VALUE)
                dist[i] = -1;
        }
        
        return dist;
        
    }
}
