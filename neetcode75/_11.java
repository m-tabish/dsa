class _11 {
    public int maxArea(int[] height) {
        int j = height.length - 1, max = 0, i = 0;
        while (i < j) {
            max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
