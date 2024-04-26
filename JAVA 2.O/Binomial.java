import java.util.*;
public class Binomial {
    public static int factorial (int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static int BinomiallCoefficient(int n, int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n-r);
        int BC = factn/(factr*factnmr);
        return BC;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in );
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        System.out.print("Enter the r : ");
        int r = sc.nextInt();
        System.out.println("The Binomial factorial is : "+BinomiallCoefficient(n, r));
        sc.close();



    }
}
