import java.util.*;
public class Palendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterr the number : ");
        int n = sc.nextInt();
        
        int rev = 0;
        int a = n;
        while(n>0){
           int lastdigit = n%10;
           rev = rev*10+lastdigit;
           n = n/10;
        }
        if(a == rev){
            System.out.println("Is a palendrom ");
        }
        else{
            System.out.println("Is not a palendrom");
        }
        sc.close();

    }
    
}
