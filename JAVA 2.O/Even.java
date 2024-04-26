import java.util.*;
public class Even {
    public static boolean even(int n){
        boolean even = false;
        if(n%2==0){
            even = true;
            // break;
        }
        return even;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(even(n));
        sc.close();

    }
}
