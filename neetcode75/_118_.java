class _118 {

    private int comb(int n, int r) {
        if (r > n || r < 0)
            return 0;
        if (r == 0 || r == n)
            return 1;

        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return (int) res;
    }

    public List<List<Integer>> generate(int numRows) {
        int sum = 0;
        List<List<Integer>> res = new ArrayList<>();

        
        int n = numRows;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list =  new ArrayList<>();
             
            for (int j = 0; j < i; j++) {
                list.add(comb(i-1, j));
            }
            res.add(list);
        }

        return res;
    }
}