// Use formula for nCr where n=freq of element and r =2;
// solve formula on paper and we get n(n-1)/2 as the final formula
class _1512 {
    public int numIdenticalPairs(int[] nums) {
        int j =0, ans=0, count[] = new int[101];
        while(j<nums.length)
        {
            count[nums[j++]] +=1;
        }

        for(int i=0 ;i<count.length;i++)
        {
            if(count[i]>1){
                int n  = count[i];
                ans+= n*(n-1)/2;
            }
        }
        return ans;
    }
}