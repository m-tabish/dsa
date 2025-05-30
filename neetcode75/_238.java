class _238 {
    public int[] productExceptSelf(int[] nums) {

        int res[] = new int[nums.length];
        int len = nums.length;

        if (len < 2) {
            return nums;
        }
        res[0] = 1;

        for (int i = 1; i < len; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;

    }

}
