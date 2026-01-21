import java.util.ArrayList;
import java.util.List;

class _1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int in[] = new int[n];

        List<Integer> list = new ArrayList<>();
        for (List<Integer> e: edges) {
            in[e.get(1)] += 1;
        }

        for (int i = 0; i < n; i++) {
            if (in[i] == 0) {
                list.add(i);
            }
        }

        return list;
    }
}