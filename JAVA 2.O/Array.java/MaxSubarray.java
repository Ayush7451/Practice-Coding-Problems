public class MaxSubarray {
    public static void maxsubarray(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                currsum = 0;
                for(int k=i; k<=j; k++) {
                    currsum+=num[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("The max sum is : "+maxsum);
    }
    public static void main(String[] args) {
        int num [] = {2,4,6,8,10};
        maxsubarray(num);
    }
}
