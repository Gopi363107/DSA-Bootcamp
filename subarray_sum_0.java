//length of the longest subarray with zero sum
import java.util.*; 

public class subarray_sum_0 {

    static int brute_force(int [] arr ){
        
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            int sum = 0;
            for (int j = i; j < arr.length; ++j) {
                sum += arr[j] ; 

                if(sum == 0){
                    max = Math.max(max,j-i+1);
                }
               
            }
        }
        return max;
    }

    static int optimal_approach(int [] arr){

        HashMap<Integer , Integer> mpp = new HashMap<>();

        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum == 0){
                maxi = i+1 ;
            }
            else{
                if(mpp.get(sum) != null){
                    maxi = Math.max(maxi , i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;

    }
    public static void main(String args[]){
        int[] arr={9,-3,3,-1,6,-5};
        System.out.println("longest subarray with sum 0 is "+brute_force( arr ));

        
        System.out.println("longest subarray with sum 0 is "+optimal_approach( arr ));
    }
    
}
