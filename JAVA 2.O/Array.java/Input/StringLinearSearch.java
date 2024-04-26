import java.util.*;
public class StringLinearSearch {
    public static String linearsearch(String fruits[], String key){
        for(int i=0; i<=fruits.length; i++){
            if(fruits[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[] = {"Orange","Apple","Banana"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit name :");
        String key = sc.nextLine();
        String index = linearsearch(fruits,key);
        if(key==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index : "+index);
        }

    }
}
