//sorting 0's 1's 2's in an array

import java.util.*;

public class sortAnArrayzeroes {

    public static void sortAnArray(ArrayList<Integer> arr,int n){
        
        int cnt0 =0,cnt1 = 0;
        
        for (int i = 0; i < n; i++) {
           if (arr.get(i) == 0){
                cnt0++;
           } 
           else if(arr.get(i) == 1){
                cnt1++;
           }
           else{
                
           }
        }

        for (int i = 0; i < cnt0; i++) {
            arr.set(i,0);
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr.set(i,1);
        }
        for (int i = cnt0+cnt1; i < n; i++) {
            arr.set(i,2);
            
        }
        
        
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]  {1 , 2 , 2 , 0 , 0 , 1 , 2 , 0 , 0 , 1 }));
        int n = 10;
        sortAnArray(arr,n);
        System.out.print("after sorting :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
            
        }
        System.out.println();
        
    }
    
}
