import java.util.Scanner;

public class _2114A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0) {
            String a = sc.next();
            int num = Integer.parseInt(a);
            int b = (int) Math.sqrt(num);

            if ((int) (b * b) == num) {
                System.out.println(0 + " " + b);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
