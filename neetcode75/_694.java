
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _694 {

    public int countDistinctIslands(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Set<List<String>> set = new HashSet<>();

        boolean vis[][] = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    List<String> list = new ArrayList<>();
                    dfs(i, j, grid, vis, i, j, list);
                    set.add(new ArrayList<>(list));
                }

            }
        }
        return set.size();

    }

    private void dfs(int sr, int sc, int[][] grid, boolean[][] vis, int base_r, int base_c, List<String> list) {

        vis[sr][sc] = true;

        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, -1, 0, 1};

        list.add((sr - base_r) + "," + (sc - base_c));

        for (int i = 0; i < 4; i++) {
            int nr = sr + dr[i];
            int nc = sc + dc[i];

            if ((nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length) && grid[nr][nc] == 1 && !vis[nr][nc]) {

                dfs(nr, nc, grid, vis, base_r, base_c, list);
            }
        }
    }

}
{
    
}
