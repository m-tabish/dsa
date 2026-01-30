class Solution {
    private int helper(int nums[], int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        if (nums[n] != -1)
            return nums[n];
        return nums[n] = helper(nums, n - 1) + helper(nums, n - 2) + helper(nums, n - 3);
    }

    public int tribonacci(int n) {
        int nums[] = new int[38];
        Arrays.fill(nums,-1);
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        int c = helper(nums, n);
        return nums[n];
    }
}