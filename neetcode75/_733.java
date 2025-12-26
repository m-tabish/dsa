
class _733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if (color != oc) {
            dfs(image, sr, sc, color, oc);
        }
        return image;
    }

    private void  dfs(int[][] image, int r, int c, int color, int oc){
        if(image[r][c]== oc ){
            image[r][c] = color;

            if(r>=1){
                dfs(image, r-1, c, color , oc);
            }
            
            if(r+1<image.length){
                dfs(image, r+1, c, color , oc);
            }
            
            if(c>=1){
                dfs(image, r, c-1, color , oc);
            }
            
            if(c+1<image[0].length){
                dfs(image, r, c+1, color , oc);
            }
        }
        return ;
     
    }
}