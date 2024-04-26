public class ArrayQ1 {
    public static boolean Repeted(int num []){
        for(int i=0; i<num.length-1; i++) {
            for(int j=i-1; j<num.length; j++) {
                if(num[i]==num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String args []) {
        int num [] = {1,3,5,2,7,9,6};
        System.out.println(Repeted(num));
    }
}
