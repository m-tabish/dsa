class _maxCount {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = Integer.MIN_VALUE, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ++count;
            } else if (nums[i] == 0) {
                count = 0;
            }
                maxcount = Math.max(count, maxcount);
        }

        return maxcount;
    }
}