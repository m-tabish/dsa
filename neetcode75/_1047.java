import java.util.Stack;

class _1047 {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && ch == st.peek())
                st.pop();
            else
                st.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}

 
/*TWO POINTER SOLUTION */
// class Solution {
//     public String removeDuplicates(String s) {
//         int start = 0;

//         char ar[] = s.toCharArray();
//         for (int end = 0; end < s.length(); end++) {
//             if (start > 0 && ar[start - 1] == ar[end]) {
//                 start--;
//             } else {
//                 ar[start] = ar[end];
//                 start += 1;
//             }
//         }

//         return new String(ar, 0, start);
//     }
// }