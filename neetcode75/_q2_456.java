class _q2_456 {
    private int findpre(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return i;
            }
        }
        return minLen;
    }

    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int lcp[] = new int[n - 1];
        int prefix[] = new int[n - 1];
        int suffix[] = new int[n - 1];
        int answer[] = new int[n];

        if (n == 1) {
            return new int[] {0};
        }
        for (int i = 0; i < n - 1; i++) {
            lcp[i] = findpre(words[i], words[i + 1]);
        }

        prefix[0] = lcp[0];
        for (int i = 1; i < n - 1; i++) {
            prefix[i] = Math.max(prefix[i - 1], lcp[i]);
        }

        suffix[n - 2] = lcp[n - 2];
        for (int i = n - 3; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], lcp[i]);
        }

        for (int i = 0; i < n; i++) {
            int maxlcp = 0;

            if (i - 2 >= 0) {
                maxlcp = Math.max(maxlcp, prefix[i - 2]);
            }

            if (i + 1 <= n - 2) {
                maxlcp = Math.max(maxlcp, suffix[i + 1]);
            }
            if (i > 0 && i < n - 1) {
                int newlcp = findpre(words[i - 1], words[i + 1]);
                maxlcp = Math.max(maxlcp, newlcp);

            }

            answer[i] = maxlcp;
        }

        return answer;
    }
}s
