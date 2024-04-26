import java.util.*;
public class Factorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        int factn = 1;
        for(int i=1; i<=n; i++){
            factn*=i;
        }
        int factr = 1;
        for(int j=1; j<=r; j++){
            factr*=j;
        }
        int factnmr = 1;
        for(int k=1; k<=(n-r); k++){
            factnmr*=k;
        }
         
        System.out.println("the binomil factorial is : "+factn/(factr*factnmr));
        sc.close();

    }
}
