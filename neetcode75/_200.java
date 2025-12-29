
class _200 {

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int res = 0;
        boolean vis[][] = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    dfs(i, j, grid, vis, res);
                    res += 1;
                }
            }
        }
        return res;
    }

    private void dfs(int sr, int sc, char[][] grid, boolean vis[][], int res) {
        vis[sr][sc] = true;

        int dir[][] = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

        for (int i = 0; i < 4; i++) {
            int nr = sr + dir[i][0];
            int nc = sc + dir[i][1];

            if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == '1' && !vis[nr][nc]) {
                dfs(nr, nc, grid, vis, res);
            }
        }
    }
}
