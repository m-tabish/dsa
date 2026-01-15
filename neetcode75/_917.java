import java.util.Stack;

class _917 {
    private boolean isAlpha(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }

    public String reverseOnlyLetters(String s) {

        int l = 0, r = s.length() - 1;
        Stack<Character> alpha = new Stack<>();
        char str[] = s.toCharArray();

        while (l < r) {
            char chl = str[l], chr = str[r];

            if (!isAlpha(chl)) {
                l++;
            } else if (!isAlpha(chr)) {
                r--;
            } else {
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
                l++;
                r--;
            }
        }

        return new String(str);

    }
}