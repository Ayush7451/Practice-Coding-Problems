import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
            sc.close();
        }
    }
}
