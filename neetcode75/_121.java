class _121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        if (prices.length == 1) {
            return 0;
        }
        for (int i = 0, j = 1; j < prices.length; j++) {

            if (prices[j] < prices[i]) {
                i = j;
            }
            max = Math.max(prices[j] - prices[i], max);
        }
        return max;
    }
}
