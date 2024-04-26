public class MaxSubarray3 {
    public static void maxsubarraysum(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            currsum += num[i];
            
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum , maxsum);
        }
        System.out.println("Max sum is a : "+maxsum);
    }
    public static void main(String [] args){
        int num [] = {-2,-3,4,-1,-2,1,5,-3};
        maxsubarraysum(num);
    }
}
