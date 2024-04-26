import java.util.*;
public class DecToBin {
    public static void dectobin(int DecNo){
        int MyNum = DecNo;
        int pow = 0;
        int bin = 0;
        while(DecNo > 0){
            int rem = DecNo%2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            DecNo = DecNo/2;
        }
        System.out.println("Binary form of "+MyNum+"="+bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int DecNo = sc.nextInt();
        dectobin(DecNo);
        sc.close();
    }
}
