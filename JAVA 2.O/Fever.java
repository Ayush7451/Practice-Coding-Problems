import java.util.*;
public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you temperature : ");
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("You have a fever, or tum marne wale ho");
        }
        else{
            System.out.println("You have no fever ");
            sc.close();
        }
    }
}
