
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class _15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int t = 0;
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == t) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < t) {
                    j++;
                } else
                    k--;
            }
        }
        list.addAll(set);
        return list;
    }
}
