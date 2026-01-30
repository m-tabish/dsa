class _403 {
    int[][] dp;

    public boolean canCross(int[] stones) {
        int n = stones.length;
        dp = new int[n][n + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        return dfs(stones, map, 0, 0);
    }

    private boolean dfs(int[] stones,
            HashMap<Integer, Integer> map,
            int index,
            int k) {

        if (index == stones.length - 1)
            return true;

        if (dp[index][k] != -1)
            return dp[index][k] == 1;

        int pos = stones[index];

        for (int nextJump = k - 1; nextJump <= k + 1; nextJump++) {
            if (nextJump > 0) {
                int nextPos = pos + nextJump;
                if (map.containsKey(nextPos)) {
                    int nextIndex = map.get(nextPos);
                    if (dfs(stones, map, nextIndex, nextJump)) {
                        dp[index][k] = 1;
                        return true;
                    }
                }
            }
        }

        dp[index][k] = 0;
        return false;
    }
}
