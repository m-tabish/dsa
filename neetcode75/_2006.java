class _2006 {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        int cnt[] = new int[100];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]] += 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (cnt[nums[i] + k] <= 100)
                count += cnt[nums[i] + k];
            if (cnt[Math.abs(nums[i] - k)] >= 1)
                count += cnt[Math.abs(nums[i] - k)];
        }
        return count / 2;
    }
}