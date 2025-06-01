class _242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int ar[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ar[s.charAt(i) - 'a'] += 1;
            ar[t.charAt(i) - 'a'] -= 1;
        }

        for (int i : ar) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }
}

// TC - O(n), SC - O(n), where n is length of string
