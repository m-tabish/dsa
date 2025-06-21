class _153 {
    public int findMin(int[] nums) {
        int len = nums.length;
        int l = 0, mid = 0, h = nums.length - 1, min = Integer.MAX_VALUE;

        while (l < h) {
            mid = l + (h - l) / 2;
            if (nums[mid] > nums[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return nums[l];
    }
}