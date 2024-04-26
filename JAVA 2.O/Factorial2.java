import java.util.*;
public class Factorial2 {
    public static int factorial(int n){
        int fac = 1;
        for(int i=1; i<=n; i++){
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
       int Fac1 = factorial(n);
       System.out.println(Fac1);
       sc.close();
    }
}
