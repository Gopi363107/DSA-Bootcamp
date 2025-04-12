//longst subarray
public class kandens_algorithm {
    public static long subarray(int[] array){
        long maxi = Long.MIN_VALUE;
        long sum  = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if(sum > maxi){
                maxi = sum ;
            }
            if(sum < 0){
                sum = 0;
            }
            
        }
        return maxi;
    }

    public static void main(String args[] ){
        int[] array = {3,8,7,9,-6,0,-1,0,1};
        System.out.println("longest subarray : "+subarray(array));
    }
}
