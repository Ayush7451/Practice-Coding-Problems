
import java.util.*;
public class Pattern12 {
    public static void HolloRhombus(int rows, int cols){
        for(int i=1; i<=rows; i++){
            for(int k=1; k<=rows-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=cols; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                } else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int rows= sc.nextInt();
        System.out.println("Enter the column:");
        int cols= sc.nextInt();
        HolloRhombus(rows, cols);
        sc.close();
    }
}