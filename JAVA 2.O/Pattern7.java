import java.util.*;
public class Pattern7{
    public static void InvertedNumPyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n= sc.nextInt();
        InvertedNumPyramid(n);
        sc.close();
    }
}


