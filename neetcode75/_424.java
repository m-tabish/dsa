import java.util.HashMap;

class _242 {
    public int characterReplacement(String s, int k) {
        int l = 0, substr = 0, max = 0, mf = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            mf = Math.max(map.get(s.charAt(r)), mf);

            while (r - l + 1 - mf > k) {
                char left = s.charAt(l);
                map.put(left, map.get(left) - 1);
                l++;
            }
            max = Math.max(max, r - l + 1);

        }

        return max;
    }
}
