// In place changing the array Space is constant in C++ but not in java
// Without stack
class _3174 {
    public String clearDigits(String s) {
        int anslen = 0;
        char charArray[] = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                anslen--;
            } else {
                charArray[anslen++] = s.charAt(i);
            }
        }

        s = new String(charArray, 0, anslen);
        return s;
    }
}

/*
WIth Stack
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9')
                st.pop();
            else
                st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: st){
            sb.append(ch);
        }
         
        return sb.toString();
    }
}
 */