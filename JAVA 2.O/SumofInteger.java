import java.util.*;
public class SumofInteger{
    public static void IntegerSum(int n){
        int sum = 0;
        while(n>0){
            int lastdigit = n%10;
            sum+=lastdigit;
            n = n/10;        
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        IntegerSum(n);
        sc.close();
    }
}
