import java.util.Arrays;

class _455 {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;

        int n = g.length; // kids
        int m = s.length; // cookie size
        if (n == 0 || m == 0)
            return 0;

        Arrays.sort(s);
        Arrays.sort(g);

        int j = 0, i = 0;

        while (i < n && j < m) { // i on kids , j on cookies

            if (s[j] >= g[i]) {
                ans++;
                j++;
                i++;
            } else
                j++;

        }
        return ans;
    }
}
