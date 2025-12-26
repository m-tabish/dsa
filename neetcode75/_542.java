class Node {
    int first;
    int second;
    int third;

    Node(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

class _542 {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length, n = mat[0].length;
        int vis[][] = new int[m][n];
        int[][] dist = new int[m][n];

        Queue<Node> q = new LinkedList<Node>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Node(i, j, 0));
                    vis[i][j] = 1;
                } else {
                    vis[i][j] = 0;
                }
            }
        }

        int around[][] = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };

        while (!q.isEmpty()) {
            int first = q.peek().first;
            int second = q.peek().second;
            int third = q.peek().third;

            q.remove();
            vis[first][second] = 1;
            dist[first][second] = third;
            for (int i = 0; i < 4; i++) {
                int nrow = first + around[i][0];
                int ncol = second + around[i][1];

                if (nrow < m && ncol < n && nrow >= 0 && ncol >= 0 && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.add(new Node(nrow, ncol, third + 1));
                }
            }

        }
        return dist;
    }
}