public class BubbleSort {
    public static void bubblesort(int num[]){
        for(int i=0; i<num.length-1; i++){
            for(int j=0; j<num.length-1-i; j++){
                if(num[j] > num[j+1]){
                    //swap
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public static void printnum (int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num [] = {5,4,1,3,2};
        bubblesort(num);
        printnum(num);
    }
}
