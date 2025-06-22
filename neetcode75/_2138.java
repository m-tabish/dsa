
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int numGroups = s.length() % k == 0 ? s.length() / k : s.length() / k + 1;
        String[] list = new String[numGroups];
        int count = 0;
        int j = 0;
        while (j + k <= s.length()) {
            list[count++] = s.substring(j, j + k);
            j += k;
        }

        if (s.length() % k != 0) {
            String str = s.substring((s.length() / k) * k, s.length());
            while (str.length() < k) {
                str += fill;
            }
            list[count] = str;
        }

        return list;
    }
}
