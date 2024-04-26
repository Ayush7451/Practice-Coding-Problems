public class ArrayQ4 {
    public static int trappedwater(int height[]){
        int n = height.length;
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        //calcutate left max boundary
        for(int i=0; i<=n; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
        //calculate left max boundary
        int rightMax [] = new int [n]; 
        rightMax[n-1] = height[n-1];
        
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
             trappedWater += waterlevel - height[i];
        }
        return trappedWater;

    }
    public static void main(String args []){
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedwater(height));
    }
}
