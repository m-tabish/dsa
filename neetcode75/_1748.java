class _1748 {
    public int sumOfUnique(int[] nums) {
        int count[]=  new int[101];
        for(int i= 0 ;i<nums.length;i++){
            count[nums[i]] +=1;
        }
        int sum =0 ;
        for(int i=0;i<count.length;i++){
            if(count[i] == 1){
                sum+=i;
            }
        }
        return sum;
    }
}