class _concat_array {
    public int[] getConcatenation(int[] nums) {
        int i =0 ;
        int[] res= new int[2*nums.length];
        
        while(i<res.length){
            res[i] = nums[i%nums.length];
            i++;
        }

        return res;
    }
}