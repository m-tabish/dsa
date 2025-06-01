
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


class _49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        int alpha[] = new int[26]; // declare new array for each string

        // traverse strs
        for (int i = 0; i < strs.length; i++) {
            alpha = new int[26];
            String s = strs[i];
            for (char ch : s.toCharArray()) {
                // incrementing one in each character's index
                alpha[ch - 'a'] += 1;
            }

            String key = Arrays.toString(alpha);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
