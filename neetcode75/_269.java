import java.util.ArrayList;

class _269 {
    public String findOrder(String[] words) {
        
        // dict[] = [b,a,c,d] - reference dictionary
        // every time we perform a comparison we will check the order from the ref dict
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] present = new boolean[26];
        int[] vis  = new int[26];
        int[] path = new int[26];
        int n = words.length;
        

        // Initialising the adj list
        for(int i = 0 ;i<26;i++){
            adj.add(new ArrayList<>());
        }
        
         // Mark present characters
        for(String w : words){
            for (char c : w.toCharArray()){
                present[c-'a'] = true;
            }
        }
         
        
         // Build graph
        for(int i = 0 ;i<n-1;i++){
            
            String w1 = words[i], w2 = words[i+1];
            
            int minLen =Math.min(w1.length(),w2.length());
            
            boolean diff = false;
            
            
            for(int j =0 ;j<minLen;j++){

                char wc1 = w1.charAt(j),  wc2 = w2.charAt(j);

                if(wc1 != wc2){
                    adj.get(wc1-'a' ).add(wc2-'a' );
                    diff= true;
                    break;
                }
            }
                // Invalid case: prefix issue e.g. [abc , ab]
            if(!diff && w1.length() > w2.length()){
                return "";
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0;i<26;i++){
            if(vis[i]==0 && present[i]){
                if(dfs(i , adj, vis, path,sb)) return "";
            }
        }
        
        return sb.reverse().toString();
    }
    
    // dfs call
    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj , int[] vis, int[] path , StringBuilder sb){
        vis[node] = 1;
        path[node] =1 ;
        
        for(int i:adj.get(node)){
            if(vis[i]==0){
                
                if(dfs(i , adj, vis, path,sb)) return true;
            }
            
            else if (path[i] ==1) return true;
        }
        
        path[node] =0;
        sb.append(((char) (node + 'a')));
        
        return false;
    }
}