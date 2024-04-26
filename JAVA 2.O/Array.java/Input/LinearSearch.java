import java.util.*;
public class LinearSearch {
    public static int linearsearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number [] = {1,2,3,4,6,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to find : ");
        int key = sc.nextInt();
        int index = linearsearch(number, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Number found at index : "+index);
            sc.close();
        }
    }    
}
