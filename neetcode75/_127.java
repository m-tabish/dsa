
class Pair {

    String s;
    int n;

    Pair(String s, int n) {
        this.s = s;
        this.n = n;
    }
}

class _127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        Queue<Pair> q = new LinkedList<>();

        int n = 1;
        Set<String> set = new HashSet<>();

        for (String s : wordList) {
            set.add(s);
        }

        q.add(new Pair(beginWord, n));

        set.remove(beginWord);
        while (!q.isEmpty()) {
            Pair p = q.poll();

            String str = p.s;

            int dist = p.n;
            if (str.equals(endWord)) {
                return dist;
            }

            for (int i = 0; i < str.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {

                    char replaceCharArray[] = str.toCharArray();
                    replaceCharArray[i] = ch;
                    String new_s = new String(replaceCharArray);

                    if (set.contains(new_s)) {
                        q.add(new Pair(new_s, dist + 1));
                        set.remove(new_s);
                        System.out.println(new_s + " " + dist);
                    }
                }
            }
        }

        return 0;
    }
}
