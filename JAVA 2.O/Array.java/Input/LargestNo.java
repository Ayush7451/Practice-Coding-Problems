public class LargestNo {
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number [] = {1,3,6,4,8,9};
        System.out.println("Largest number is : "+getlargest(number));
    }
}
