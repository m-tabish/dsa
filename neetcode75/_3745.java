import java.util.Arrays;

class _3745 {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1] + nums[nums.length - 2] - nums[0];
        return max;
    }
}
