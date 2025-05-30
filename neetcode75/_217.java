import java.util.HashSet;
import java.util.Set;

class _217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);

        }

        return set.size() < nums.length;

    }

    public static void main(String[] args) {
        _217 obj = new _217();
        int nums[] = {1, 2, 3, 1};
        System.out.println(obj.containsDuplicate(nums));

    }
}
