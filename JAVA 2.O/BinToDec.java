import java.util.*;
public class BinToDec {
    public static void BinTOdec(int BinNo ){
        int MyNum = BinNo;
        int pow=0;
        int decNum=0;
        while(BinNo > 0){
            int lastdigit = BinNo % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            BinNo = BinNo/10;
        }
        System.out.println("Decimal of "+MyNum+"="+decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int BinNo = sc.nextInt();
        BinTOdec(BinNo);
        sc.close();
    }
}
