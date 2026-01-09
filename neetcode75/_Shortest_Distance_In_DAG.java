// User function Template for Java
/*
1. CREATE ADJACENCY LIST WITH EDGES MATRIX
2. APPLY TOPO SORT AND GET THE SORTED NODES IN STACK
3. NOW CALCULATE THE DISTANCE OF EACH NODE FROM SOURCE BY TAKING OUT TOP NODE FROM STACK AND PERFORM DISTANCE UPDATE (RELAXATION OF EDGES) ONLY WHEN DIST != INF BECAUSE THAT MEANS IT CANNOT BE REACHED. IT WILL HAVE -1

 */
import java.util.ArrayList;
import java.util.Stack;

class Pair{
    int node , weight;
    
    Pair(int node, int weight){
        this.node = node;
        this.weight = weight;
    }
}

class _Shortest_Distance_In_DAG {

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int[] dist = new int[V];
        
        
        // declaring and initialising adj and dist
        for(int i=0 ;i<V;i++){
            adj.add(new ArrayList<>());
            dist[i] =   Integer.MAX_VALUE;
        }
        
        // filling adj list
        for(int i =0;i<E;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            
            adj.get(u).add(new Pair(v, w));
        }
        
        
        // Topo Sort
        Stack<Integer> st = new Stack<>();
        int vis[] = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i] == 0 ){
                topo(i, adj, vis, st);
            }
        }
        
        
        
        // finding distances
        dist[0] = 0;
        while(!st.isEmpty()){
            int top = st.peek();
            st.pop();
            
           if(dist[top] != Integer.MAX_VALUE){
                for(Pair pair :adj.get(top)){
                        if(dist[top] + pair.weight < dist[pair.node])
                    {
                       dist[pair.node] = dist[top] +pair.weight;
                    }
                }
            }
        }
        
        for(int i=0 ;i<V;i++){
            if(dist[i] == Integer.MAX_VALUE)
                dist[i] = -1;
        }
        
        return dist;
    }
    
    private void topo(int vertex,ArrayList<ArrayList<Pair>> adj ,int[] vis, Stack<Integer> st  ){
        vis[vertex] = 1;
        
        for(Pair pair:adj.get(vertex)){
            if(vis[pair.node] == 0){
                topo(pair.node, adj,vis, st);
            }
        }
        
        st.add(vertex);
    }
}