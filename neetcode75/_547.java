import java.util.LinkedList;
import java.util.Queue;

class _547 {
    private void bfs(int node, int[][] isConnected, boolean[] visit) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(node);
        visit[node] = true;
        while (!q.isEmpty()) {
            node = q.poll();
            for (int i = 0; i < isConnected.length; i++) {
                if (isConnected[node][i] == 1 && !visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visit[] = new boolean[n];

        int numComp = 0;
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                numComp++;
                bfs(i, isConnected, visit);
            }
        }

        return numComp;
    }
}
