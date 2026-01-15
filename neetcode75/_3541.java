class _3541 {
    public int maxFreqSum(String s) {
        if (s.length() == 0)
            return 0;
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a'] += 1;
        }

        int maxV = 0, maxC = 0;
        for (int i = 0; i < alpha.length; i++) {
            String v = "aeiou";
            if (v.indexOf((char) ('a' +i) ) >= 0)
                maxV = Math.max(maxV, alpha[i]);
            else
                maxC = Math.max(maxC, alpha[i]);
        }
        return maxV + maxC;
    }
}