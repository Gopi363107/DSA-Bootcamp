//sum of two numbers to get the target value

import java.util.HashMap;


public class twosum {

    //brute force method
    public static int[] twosum1(int arr[],int target){
        int [] ans =new int [2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
              if(i == j) continue;  
              if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
              }  
            }
            
        }
        return ans;
    }

    //better approach using hashmap
    public static int[] twosum2 (int arr[] , int target){
        int[] ans1 = new int[2];
        ans1[0] = ans1[1] =-1;
        HashMap<Integer , Integer > mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded =target - num;
            if(mpp.containsKey(moreNeeded)) {
                ans1[0] = mpp.get(moreNeeded);
                ans1[1] = i;
                return ans1;
            }
            mpp.put(arr[i], i);
            
        }
        return ans1;
    }  

    //optimal approach using two pointer
    public static int[] twosum3(int arr[] , int target) {
        int[] ans2 = new int[2];
        ans2[0] = ans2[1] =-1;
        int left = 0;
        int right = arr.length - 1 ;
        while(left < right ){
            int sum = arr[left] + arr[right] ;
            if( sum == target){
                ans2[0] = left ;
                ans2[1] = right ;
                return ans2;
            }
        }
        return ans2;

    }

    //main function
    public static void main(String args[]){
        int arr[] = {2 ,6 ,5 ,8 ,11 };
        int target = 8;
        int[] ans  = twosum1(arr , target);
        int[] ans1 = twosum2(arr, target);
        int[] ans2  = twosum3(arr , target);
        System.out.println("this is the answer for target value array twosum1 : ["+ans[0]+" ,"+ans[1]+"]");
        System.out.println("this is the answer for target value array twosum2 : ["+ans1[0]+" ,"+ans1[1]+"]");
        System.out.println("this is the answer for target value array twosum3 : ["+ans2[0]+" ,"+ans2[1]+"]");
    }
    
}
