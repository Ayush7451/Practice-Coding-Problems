
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt ();
        for(int i=0;i<=n;i++){
            n*=i;
        }
        System.out.println(n);
        sc.close();
    }
}
