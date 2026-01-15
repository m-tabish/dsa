class _1832 {
    public boolean checkIfPangram(String sentence) {
        int count[] = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            count[sentence.charAt(i) - 'a'] += 1;
        }
        for (int i : count) {
            if (i ==0 ) {
                return false;
            }
        }
        return true;
    }
}