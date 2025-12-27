
class Solution {

    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        if (m == 0 && n == 0) {
            return;
        }

        boolean vis[][] = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //boundary element
                if (board[i][j] == 'O' && (i == 0 || i == m - 1 || j == 0 || j == n - 1)) {
                    dfs(i, j, board, vis);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !vis[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(int sr, int sc, char[][] board, boolean[][] vis) {
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0, -1};
        int m = board.length, n = board[0].length;
        vis[sr][sc] = true;

        for (int i = 0; i < 4; i++) {
            int nr = sr + dr[i];
            int nc = sc + dc[i];

            if (nr >= 0 && nr < m && nc >= 0 && nc < n && !vis[nr][nc] && board[nr][nc] == 'O') {
                dfs(nr, nc, board, vis);
            }
        }
    }

}
