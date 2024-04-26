import java.util.*;
public class SumUsingFunction {
    public static void SumofNumber(int a, int b){
        int sum = a + b;
        System.out.println("The sum is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        SumofNumber(a,b);
        sc.close();
    }
}
