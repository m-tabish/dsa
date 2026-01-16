class Solution {
    private int bsf(int nums[], int target) {
        int l = 0, h = nums.length - 1;
        int idx = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                {
                    idx = mid;
                    h = mid - 1;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return idx;
    }

    private int bsl(int nums[], int target) {
        int l = 0, h = nums.length - 1;
        int idx = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                {
                    idx = mid;
                    l = mid + 1;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = bsf(nums, target);
        res[1] = bsl(nums, target);
        return res;
    }
}