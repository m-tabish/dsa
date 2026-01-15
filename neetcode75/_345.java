/*WE NEED TO CONVERT THE STRING TO ARRAY BECAUSE S.REPLACE() REPLACES ALL OCCURENCES OF CHARACTER EITHER USE string.replaceFirst(ch ,ch) */
class _345{
    public String reverseVowels(String str) {
        String v = "AEIOUaeiou";

        int i = 0, j = str.length() - 1;

        char s[] = str.toCharArray();
        while (i < j) {
            char chi = str.charAt(i), chj = str.charAt(j);
            if (v.indexOf(chi) < 0 && v.indexOf(chj) >= 0) {
                {
                    i++;
                    continue;
                }
            } else if (v.indexOf(chi) >= 0 && v.indexOf(chj) < 0) {
                {
                    j--;
                    continue;
                }
            } else if (v.indexOf(chi) >= 0 && v.indexOf(chj) >= 0) {
                {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;

                    i++;
                    j--;
                    continue;
                }
            }
            i++;
            j--;
        }

        String res = "";
        for (char ch : s) {
            res += ch;
        }
        return res;

    }
}