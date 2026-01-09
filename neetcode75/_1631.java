import java.util.Arrays;
import java.util.PriorityQueue;

class Tuple{

    int x ;
    int y ;
    int dist;
    Tuple(int x , int y, int dist){
        this.x = x;
        this.y= y;
        this.dist= dist;
    }
}
public class _1631 {
    public int minimumEffortPath(int[][] heights) {
        // BFS
        int rows = heights.length, col = heights[0].length;
        int[][] dist = new int[rows][col];
        for(int row[] : dist){
            Arrays.fill(row, (int) 1e9);
        }

        dist[0][0] = 0;
        PriorityQueue<Tuple> q = new PriorityQueue<>((x, y)->x.dist -y.dist);
        int diff = 0;
        int minDiff = Integer.MAX_VALUE;
        q.add(new Tuple(0,0,0));

        while (!q.isEmpty()) {
            Tuple node = q.poll();
            int r = node.x;
            int c = node.y;
            int d = node.dist;

            int directions[][] = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
            for (int dir[] : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if ((nr >= 0 && nr < rows && nc >= 0 && nc < col)) {
                    int new_dist = Math.max(Math.abs(heights[nr][nc]-heights[r][c]), d);
                    if (new_dist < dist[nr][nc]) {
                        dist[nr][nc] = new_dist;
                        q.add(new Tuple(nr, nc, new_dist));
                    }
                }
            }

        }
        return dist[rows-1][col-1];
    }
}
