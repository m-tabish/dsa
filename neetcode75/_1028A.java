import java.util.Scanner;

public class _1028A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int k = 1;


            if (Math.min(b, d) <= Math.min(a, c)) {
                System.out.println("Gellyfish");
            } else
                System.out.println("Flower");

            t--;

        }

    }
}


