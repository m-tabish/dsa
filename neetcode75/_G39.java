// User function Template for Java

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int node; int steps ;
    Pair(int node, int steps){
        this.node = node;
        this.steps = steps;
    }
}

class _G39 {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        int mod = 100000;
        Queue<Pair> q = new LinkedList<>();
        int dist[] = new int[mod];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        q.add(new Pair(start, 0));
        dist[start ] = 0;
        
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int node = pair.node;
            int step = pair.steps;
            
            if(node == end) return step;
            
            for(int i =0 ;i<arr.length;i++){
                int x  = (arr[i]*node)%mod;
                
                if(step + 1 < dist[x]){
                    dist[x] =step+1;
                    q.add(new Pair(x, step+1));
                }
                
            }
        }
        
        return -1;
    }
}
