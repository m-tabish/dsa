import java.util.HashMap;

public class _76 {

    public String minWindow(String s, String t) {

        String win = "", minS = "";
        int l = 0, r = 0, sl = s.length(), tl = t.length(), minl[] = {0,0} , have =0 , need = tl;

        HashMap<Character, Integer> ms = new HashMap<>();
        HashMap<Character, Integer> mt = new HashMap<>();


        if (tl > sl)
            return "";

        //Storing characters of t in map1
        for (int i = 0; i < tl; i++) {
            ms.put(s.charAt(i), ms.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(;r<sl;r++){
            // case1: increase window 
            win+=s.charAt(r);
                         
            // case2: decrease window
            while(have==need || ms.equals(mt)) {
                win = win.substring(l,r);
                ms.put(s.charAt(l), ms.get(s.charAt(l))-1);
                l++;
            }
        }
         
 
        return minS;

    }
}
