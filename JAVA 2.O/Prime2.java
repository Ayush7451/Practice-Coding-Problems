import java.util.*;
public class Prime2 {
    public static boolean Prime(int n){
        boolean Prime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                Prime = false;
                break;
            }
        }
        return Prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // int Bul = prime(n);
        System.out.println(Prime(n));
        sc.close();
    }
}
