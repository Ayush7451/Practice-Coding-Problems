import java.util.*;
public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print hello");
        int n = sc.nextInt();
        int counter = 1;
        do{
            System.out.println("Hello");
            counter++;
        }
        while(counter <= n);
        sc.close();
    }
}
