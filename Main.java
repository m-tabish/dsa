 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0 ;i<t;i++){
            int n =sc.nextInt();
            int k = sc.nextInt();
            int ar[] =new int[n];
            for(int j =0 ;j<n;j++){
                ar[j] = sc.nextInt();
            }
            Main obj  = new Main();
            obj.check(n, k , ar);
        }

    }
    
        private void check(int n , int k , int ar[]){
            if(k <= 1){
                for(int i =0 ;i<n-1;i++){
                    if(ar[i]>ar[i+1]) {
                        System.out.println("NO");
                        return;
                    }
                }
                System.out.println("YES");
                return;
            }
            else{
                System.out.println("YES");
                return ;
            }
            
        }
}
