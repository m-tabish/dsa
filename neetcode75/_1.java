class _1 {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = {0, 0};
        int j = 0;
        int sum = nums[0];
        // [3,2,3] ,6
        for (int i = 1; i < nums.length; i++) {
            if (i != j)
                sum += nums[i]; // s = 3+2+

            if (sum > target) {
                sum -= nums[j++];
            }
            if (sum == target) {
                ans[0] = i;
                ans[1] = j;

            }
        }
        return ans;
    }
}
