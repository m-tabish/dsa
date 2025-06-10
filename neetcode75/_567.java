import java.util.HashMap;
class _567 {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int l1 = s1.length(), l2 = s2.length();
        int l = 0, r = 0;
        if (s1.length() > s2.length())
            return false;

        for (int i = 0; i < l1; i++) {

            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (map1.equals(map2))
            return true;

        for (int i = l1; i < l2; i++) {

            char chr = s2.charAt(i);
            map2.put(chr, map2.getOrDefault(chr, 0) + 1);
            char chl = s2.charAt(l);
            map2.put(chl, map2.getOrDefault(chl, 0) - 1);

            if (map2.get(chl) == 0) {
                map2.remove(chl);
            }
            l++;

            if (map1.equals(map2))
                return true;
        }
        return false;
    }
}