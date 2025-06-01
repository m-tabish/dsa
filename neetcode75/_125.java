
public class _125 {
    public boolean isPalindrome(String s) {
        String str = "";
        String rev = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                str += ch;
                rev = ch + rev;
            }

        }
        return str.equals(rev);
    }
}

// TC - O(n) . SC - O(1)

