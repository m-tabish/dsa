// https://leetcode.com/contest/weekly-contest-456/problems/partition-string/
public List<String> partitionString(String s) {
    List<String> list = new ArrayList<>();
    String seg = "";
    HashSet<String> seen = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        seg += ch;
        int prevSize = seen.size();
        seen.add(seg);
        if (seen.size() != prevSize) {
            list.add(seg);
            seen.add(seg);
            seg = "";
        }
    }

    return list;
}
