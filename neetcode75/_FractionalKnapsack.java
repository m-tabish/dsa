import java.util.Arrays;
class Item{
    int val = 0  , w = 0 ;double ratio= 0 ;
    Item(int val , int w ){
        this.val = val;
        this.w = w;
        this.ratio = (double) val/w;
    }
}
class FractionalKnapsack {
    public double fractionalKnapsack(int[] val, int[] wt, int cap) {
        int n = val.length;
        Item[] items = new Item[n];
        
        for(int i=0 ;i<n;i++){
            items[i] = new Item(val[i], wt[i]);
        }
        
        Arrays.sort(items, (a,b)->Double.compare(b.ratio, a.ratio));
          
        double cost = 0.0 ;
        int remcap = cap;
        
        for(Item item: items){
            if(remcap==0) break;
            if(item.w<=remcap){
                cost += item.val ;
                remcap -=item.w;
            }
            else {
                cost += item.val*((remcap / (double) item.w) );
                remcap =0;
            }
        }
        
        return cost;
    }
    
}