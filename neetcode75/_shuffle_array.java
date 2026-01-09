import java.util.Arrays;

class _shuffle_array {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[2*n];
    
        int i= 0 ;
        int j =n,idx=0;
        while(j<(2*n)  ){
            res[idx++] = nums[i++];
            res[idx++] = nums[j++];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}