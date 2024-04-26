public class MaxSubarray2 {
    public static void maxsubarraysum (int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix [] = new int [num.length];

        prefix[0] = num[0];
        //calculate prefix array
        for(int i=0; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){ 
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currsum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum is "+maxsum);
    }
    public static void main(String[] args) {
        int num [] = {2,4,6,8,10};
        maxsubarraysum(num);
    }
}
