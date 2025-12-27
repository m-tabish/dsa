
public class _1020DFS {

    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == m - 1 || j == 0 || j == n - 1) && grid[i][j] == 1) {

                    dfs(i, j, grid, vis);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(int sr, int sc, int[][] grid, boolean[][] vis) {
        vis[sr][sc] = true;

        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nr = sr + dr[i];
            int nc = sc + dc[i];

            if ((nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length) && grid[nr][nc] == 1 && !vis[nr][nc]) {
                dfs(nr, nc, grid, vis);
            }
        }
    }
}
{
    
}
