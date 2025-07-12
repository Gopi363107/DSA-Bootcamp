//rearrange positive and negative
import java.util.*;


public class rearrange_pos_neg {

    public static int[] rearrange(int[] arr){
        ArrayList<Integer>  pos = new ArrayList<>();
        ArrayList<Integer>  neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) pos.add(arr[i]);
            else neg.add(arr[i]);

        }

        for (int i = 0; i < arr.length/2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }

        return arr;

    }
    public static int[] rearange(int[] arr,int n){
        int[] ans = new int [n];
        int posindex = 0, negindex = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                ans[negindex]  = arr[i];
                negindex+=2;
            }
            else{
                ans[posindex] = arr[i];
                posindex += 2;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr = {1,2,-3,2,-1,-4};
        int n = arr.length;
        System.out.println(Arrays.toString(rearrange(arr)));
        System.out.println(Arrays.toString(rearange(arr,n)));
    }
    
}
