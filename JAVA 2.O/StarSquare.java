import java.util.*;
public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.println("*");
                sc.close();
            }
        }
    }
}
