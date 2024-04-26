import java.util.*;
public class ProductUsingFunction {
    public static int product(int a, int b){
        int product = a * b;
        return product;
        // System.out.print("The product is : "+product); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the 1st number :");
        int a = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        int b = sc.nextInt();
        int prod = product(a,b);
        System.out.print("The product is : "+prod);
        sc.close();

    }
}
