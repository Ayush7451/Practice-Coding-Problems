import java.util.*;
public class BinarySearch {
    public static int binarysearch(int num[], int key){
        int start = 0;
        int end = num.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid]>key){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int num [] = {1,3,5,7,6,2,9,8};
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number you want to find : ");
        int key = sc.nextInt();
        System.out.println(binarysearch(num, key));
        sc.close();
    }
}
