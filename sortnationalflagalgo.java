// sorting 0,1,2 using national flag algorithms
import java.util.*;


public class sortnationalflagalgo {

    public static void  sortArray(ArrayList<Integer> arr, int n){
        int  low = 0 , mid =0 , high = n-1;

        while(mid <= high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set( low , arr.get(mid));
                arr.set(mid , temp);

                low++;
                mid++;
            }

            else if(arr.get(mid) == 1) {
                mid++;
            }
            else {
                arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high , mid);

                high--;
            }
        }

    }


    // main function 

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]  {1 , 2 , 2 , 0 , 0 , 1 , 2 , 0 , 0 , 1 }));
        int n = 10;
        sortArray(arr,n);
        System.out.print("after sorting :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
            
        }
        System.out.println();
    }
    
}
