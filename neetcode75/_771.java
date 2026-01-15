import java.util.HashSet;
import java.util.Set;

class _771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();

        // using hash set for O(1) lookups
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i)) )
                count += 1;
        }
        return count;
    }
}