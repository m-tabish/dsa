class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, l = s.length(), len = 0, j = 0;
        HashSet<Character> charset = new HashSet<>();
        String substr = "";

        for (int i = 0; i < l; i++) {
            if (charset.contains(s.charAt(i)))
                while (charset.contains(s.charAt(i))) {
                    charset.remove(s.charAt(j));
                    j++;
                }
            charset.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}