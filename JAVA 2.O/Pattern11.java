import java.util.*;
public class Pattern11{
    public static void Rombus(int n){
      for(int i=1; i<=n; i++){
        for(int k=1; k<=n-i; k++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
      }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int n= sc.nextInt();
        Rombus(n);
        sc.close();
    }
}




