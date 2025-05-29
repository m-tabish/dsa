
// https://codeforces.com/problemset/problem/2114/B

import java.util.Scanner;

public class notquitepalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();

            int k = sc.nextInt();
            int ones = 0, zeros = 0;
            sc.nextLine();
            String s = sc.nextLine();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                } else {
                    zeros++;
                }

            }
            int up = (n - 2 * k) / 2;
            if (zeros >= up && ones >= up && (zeros - up) % 2 == 0 && (ones - up) % 2 == 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");

        }
        System.out.println();

        sc.close();
    }
}
