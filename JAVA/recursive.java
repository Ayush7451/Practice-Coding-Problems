import java.util.Scanner;
class lab2_p{
    public int aPowb(int a, int b){
        if(b==1) return a;
        return a * aPowb(a, b-1);

    }
}
public class recursive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        lab2_p obj=new lab2_p();
        int res=obj.aPowb(a,b);
        System.out.println(res);
    }
}