//Without stack O(n) , O(1)
 class _1021 {

    public String removeOuterParentheses(String s) {
        int start = 0, end = 0, sum = 0;
        String str = "";
        while (end < s.length()) {
            char ch = s.charAt(end);
            if (ch == '(')
                sum++;
            else
                sum--;

            if (sum == 0) {
                str += s.substring(start + 1, end);
                start = end + 1;
            }
            end++;

        }
        return str;
    }
}

// With Stack O(n),O(n)
/*
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (!st.isEmpty()) {
                    str += ch;
                }
                st.add(ch);
            } else {

                st.pop();
                if (!st.isEmpty()) {
                    str += ch;
                }
            }
        }
        return str;
    }
}
 */