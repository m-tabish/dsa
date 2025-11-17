import java.util.Arrays;

class _3746 {
    public int minLengthAfterRemovals(String s) {
        int res = s.length();
        char str[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = s.charAt(i);
        }

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        int j = str.length - 1;
        int i = 0;
        while (i <= j) {
            if (str[i] == str[j]) {
                break;
            }
            res -= 2;
            i++;
            j--;
        }
        return res;
    }
}
