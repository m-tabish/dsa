// User function template for JAVA

class _FloydWarshal {
    public void floydWarshall(int[][] dist) {
        // Code here
        int n = dist.length;
        int inf = (int) 1e8;
        
        for(int i= 0 ;i<n;i++){
            for(int j =0 ;j<n;j++){
                for(int k =0 ;k<n;k++){
                    if(dist[j][i] != inf && dist[i][k] != inf)
                    dist[j][k] = (int) Math.min(dist[j][k] , dist[j][i]+dist[i][k]);
                }
            }
        }
    }
}