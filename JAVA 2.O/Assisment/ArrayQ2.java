import java.util.*;
public class ArrayQ2 {
    public static int BinarySearch (int num[] , int key) {
        int start = 0;
        int end = num.length-1;
        while(start <= end){
            int mid = (start - end) / 2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    } 
    public static void main(String args []){
        int num [] = {0,1,2,4,5,6,7};
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the nunber : ");
        int key = sc.nextInt();
        System.out.println("Index is : "+BinarySearch(num,key));
        sc.close();

    }
}
