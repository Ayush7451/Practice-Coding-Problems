import java.util.*;
public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n){
            System.out.println(counter);
            counter++;
            sc.close();
        }
    }
}
