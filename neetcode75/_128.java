import java.util.HashSet;
import java.util.Set;

class _128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = 0, maxlen = 0;
        for (int i : nums) {
            set.add(i);
        }
        int prev = 0;

        for (int i : nums) {
            int cur = i;
            if (!set.contains(cur - 1)) {
                len = 1;
                while (!set.isEmpty()) {
                    if (set.contains(cur + 1)) {
                        set.remove(cur + 1);
                        len++;
                        cur = cur + 1;
                    } else {
                        break;
                    }
                }
                maxlen = Math.max(maxlen, len);
            }
        }

        return maxlen;
    }
}
