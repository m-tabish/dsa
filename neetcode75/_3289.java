class _3289 {
    public int[] getSneakyNumbers(int[] nums) {
        int res[] = new int[2], x = 0;

        // XOR all 0->n-1 numbers and nums[0] -> nums[n-1] in  same variable you will be left
        // with xor value of A^B where A,B are repeated numbers
        int xor =0;
        for(int i=0 ;i<nums.length;i++) xor ^=nums[i];
        for (int i = 0; i < nums.length-2; i++) xor ^= i ;
        
        // Now find rightmost setBit in the A^B
        int a = 0 , b = 0 , diffBit = xor & -xor  ;
        
        // Split into two groups one with setBit =0 & setBit =1;
        for(int i =0 ;i<nums.length;i++)
        {
            if((diffBit & nums[i]) == 0) a^=nums[i];
            else b ^= nums[i];
        }

        // now repeat previous for 0->n-1
        for(int i =0 ;i<nums.length-2;i++)
        {
            if((diffBit & i )==0) a^= i;
            else b ^= i;
        }

        res[0] = a;
        res[1] = b;
        return res;
    }
}