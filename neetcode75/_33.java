public class _33 {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1, idx = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                idx = mid;
                break;
            }

            // left sorted
            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || target < nums[l])
                    l = mid + 1;
                else
                    h = mid - 1;
            }

            // right is ordered
            else {
                if (target < nums[mid] || target > nums[h])
                    h = mid - 1;
                else
                    l = mid + 1;
            }

        }
        return idx;
    }
}
