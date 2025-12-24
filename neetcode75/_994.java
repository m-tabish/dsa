
class _994 {

    private int check4dir(int[][] grid ) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 0 || grid[i][j] == 2) {
                    continue;
                }

                if (i!=0 || j!=0 && grid[i - 1][j] == 2 || grid[i][j - 1] == 2 || grid[i + 1][j] == 2 || grid[i][j + 1] == 2) {
                     return -1 ;
                }

            }
        }
    
        return 1;
    }

    public int orangesRotting(int[][] grid) {_192
        int n = grid.length;

        int good = 0;
        int rot = 0;
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {

                    good += check4dir(grid); 

                } else if (grid[i][j] == 2) {
                    rot++;
                }

            }
        }

        return res;
    }
}
